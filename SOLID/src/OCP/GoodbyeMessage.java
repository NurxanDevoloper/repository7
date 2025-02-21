package OCP;

public abstract class GoodbyeMessage implements Message{
	public void printMessage() {
        System.out.println(getText());
    }
}
