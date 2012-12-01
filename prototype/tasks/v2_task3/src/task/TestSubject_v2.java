package main;

public class TestSubject_v2 {
	
	private int att1;
	private int att2;
	
	public TestSubject_v2() {

		setAtt1(0);
		setAtt2(0);
	}

	/**
	 * @return the att1
	 */
	public int getAtt1() {
		return att1;
	}

	/**
	 * @param att1 the att1 to set
	 */
	public void setAtt1(int att1) {
		this.att1 = att1;
	}

	/**
	 * @return the att2
	 */
	public int getAtt2() {
		return att2;
	}

	/**
	 * @param att2 the att2 to set
	 */
	public void setAtt2(int att2) {
		this.att2 = att2;
	}
	
	public int sub(){
		return getAtt1() * getAtt2();
	}

}
