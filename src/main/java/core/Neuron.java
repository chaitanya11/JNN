package core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author chaitanyagarikipati
 *
 */
public class Neuron {

	private List<HashMap<Float, Neuron>> dendrite;

	private CellBody cellBody;

	

	public List<HashMap<Float, Neuron>> getDendrite() {
		return this.dendrite;
	}

	public void setDendrite(List<HashMap<Float, Neuron>> dendrite) {
		this.dendrite = dendrite;
	}

	public CellBody getCellBody() {
		return cellBody;
	}

	public void setCellBody(CellBody cellBody) {
		this.cellBody = cellBody;
	}

	

	@Override
	public String toString() {
		return "Neuron [dendrite=" + dendrite + ", cellBody=" + cellBody + "]";
	}

	/**
	 * create neural network
	 */
	public Neuron(CellBody cellBody) {
		this.cellBody = cellBody;
		this.dendrite = new ArrayList<HashMap<Float, Neuron>>();
	}

	/**
	 * @param strength
	 * @param neuron
	 */
	public void addNeuron(float strength, Neuron neuron) {
		int children = this.getDendrite().size() - 1;
		HashMap<Float, Neuron> tmp = null;
		if (children >= 0)
			while (children >= 0) {
				tmp = new HashMap<Float, Neuron>();
				for (Neuron n : this.getDendrite().get(children).values()) {
					tmp.put(strength, n);
				}
				neuron.getDendrite().add(tmp);
				children--;
			}
		tmp = new HashMap<Float, Neuron>();
		tmp.put(strength, neuron);
		this.dendrite.add(tmp);
		if (children >= 0)
			while (children >= 0) {
				this.getDendrite().get(children).values().forEach(x -> {
					x.setDendrite(null);
					x.setDendrite(neuron.getDendrite());
				});
				children--;
			}
	}

}
