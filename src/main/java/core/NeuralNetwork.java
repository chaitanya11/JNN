package core;

/**
 * @author chaitanyagarikipati
 *
 */
public class NeuralNetwork {
	private Neuron neuron;

	public Neuron getNeuron() {
		return neuron;
	}

	public void setNeuron(Neuron neuron) {
		this.neuron = neuron;
	}

	/**
	 * 
	 */
	public void push(Neuron newNeuron) {
		neuron.addNeuron(newNeuron.getCellBody().getStrength(), newNeuron);
	}

	@Override
	public String toString() {
		return  neuron.toString();
	}
	
}
