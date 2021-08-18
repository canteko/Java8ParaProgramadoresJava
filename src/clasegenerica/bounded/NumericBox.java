package clasegenerica.bounded;

public class NumericBox<T extends Number> {
	private T object;

	/**
	 * @param object
	 */
	public NumericBox(T object) {
		this.object = object;
	}

	/**
	 * @return the object
	 */
	public T getObject() {
		return object;
	}

	/**
	 * @param object the object to set
	 */
	public void setObject(T object) {
		this.object = object;
	}

	@Override
	public String toString() {
		return "NumericBox [object=" + object + "]";
	}
}
