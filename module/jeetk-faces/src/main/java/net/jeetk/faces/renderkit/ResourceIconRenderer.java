package net.jeetk.faces.renderkit;

import javax.faces.render.FacesRenderer;

@FacesRenderer(
	componentFamily="javax.faces.Output",
	rendererType="net.jeetk.faces.ResourceIcon"
)
public class ResourceIconRenderer
extends ResourceRenderer
{
	public ResourceIconRenderer()
	{
	}

	@Override
	protected String getRel()
	{
		return "shortcut icon";
	}
}