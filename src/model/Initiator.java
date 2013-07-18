package model;


public class Initiator extends DPostDeclaration {

	public Initiator(SimpleSentence event, SimpleSentence fluent, AbstractOperator condition) {
		super(event, fluent, condition);
	}
	
	/**
	 * This method writes the initiator in the Prolog-like way.
	 * initiates(event, fluent).
	 */
	@Override
	public String toString() {
		String string;
		string = "initiates(" + this.event.toString() + ", " + this.fluent.toString() +")";
		
		return string;
	}

}