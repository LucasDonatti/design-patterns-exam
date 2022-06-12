package exam.designpatterns.decorator;

public abstract class TextoDecorator {
	
	private TextoDecorator decorator;

	public TextoDecorator(TextoDecorator decorator) {
		this.decorator = decorator;
	}

	public String processar(String texto) {
		if (decorator != null)
			return decorator.processar(texto);
		return texto;
	}
	
}
