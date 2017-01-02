package net.jeetk.faces.util;

import java.util.Objects;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

public class Util
{
	private Util()
	{
	}
	
	public static void renderParamsNotNull(FacesContext context,
			UIComponent component)
	{
		Objects.requireNonNull(context);
		Objects.requireNonNull(component);
	}
	
	public static RuntimeException newUnsupportedComponent(
			UIComponent component)
	{
		StringBuilder msg = new StringBuilder();
		msg.append("Unsupported component of type ");
		msg.append(component.getClass());
		return new IllegalStateException(msg.toString());
	}
}
