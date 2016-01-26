public class Client extends Person {
	private int clientId;

	public Client(long id, String name, int clientId) {
		super(id, name);
		setClientId(clientId);
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

}
