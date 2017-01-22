package extension;

import java.util.Arrays;

import core.CellBody;
import core.NeuralNetwork;
import core.Neuron;

/**
 * @author chaitanyagarikipati
 *
 */
public class Usage {

	public static void main(String[] args) {
		// output generator
		OutputGenerator output = new OutputGenerator();
		// cell body initialization
		CellBody cellBody = new CellBody();
		cellBody = createCellbody(cellBody, output.generateStrength(), output.generateOputput());

		// neuron
		Neuron neuron = new Neuron(cellBody);
		// network
		NeuralNetwork network = new NeuralNetwork();
		// head
		network.setNeuron(neuron);

		// adding new neurons
		for(int i : Arrays.asList(1,2,3,4,5)){
			cellBody = createCellbody(cellBody, i, i+" th body");
			addNeuronToNetwork(cellBody, neuron, network);
		}
		System.out.println(network);

	}

	/**
	 * @param cellBody
	 * @param strength
	 * @param output
	 * @return
	 */
	public static CellBody createCellbody(CellBody cellBody, float strength, Object output) {
		cellBody = new CellBody();
		cellBody.setOutput(output);
		cellBody.setStrength(strength);
		return cellBody;
	}

	/**
	 * @param cellBody
	 * @param neuron
	 * @param network
	 */
	public static void addNeuronToNetwork(CellBody cellBody, Neuron neuron, NeuralNetwork network) {
		neuron = new Neuron(cellBody);
		network.push(neuron);
	}
}
