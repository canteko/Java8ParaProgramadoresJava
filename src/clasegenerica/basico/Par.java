package clasegenerica.basico;

public class Par<T, S> {
	private T obj1;
	private S obj2;
	/**
	 * @param obj1
	 * @param obj2
	 */
	public Par(T obj1, S obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	/**
	 * @return the obj1
	 */
	public T getObj1() {
		return obj1;
	}
	/**
	 * @return the obj2
	 */
	public S getObj2() {
		return obj2;
	}
	/**
	 * @param obj1 the obj1 to set
	 */
	public void setObj1(T obj1) {
		this.obj1 = obj1;
	}
	/**
	 * @param obj2 the obj2 to set
	 */
	public void setObj2(S obj2) {
		this.obj2 = obj2;
	}
	@Override
	public String toString() {
		return "Par [obj1=" + obj1 + ", obj2=" + obj2 + "]";
	}
}
