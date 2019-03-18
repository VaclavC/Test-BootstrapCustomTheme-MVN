package com.disnel.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.markup.head.CssHeaderItem;
import org.apache.wicket.markup.head.HeaderItem;

import de.agilecoders.wicket.core.settings.Theme;
import de.agilecoders.wicket.sass.SassResourceReference;

public class CustomBootstrapTheme extends Theme
{

	public CustomBootstrapTheme()
	{
		super("custom-theme");
	}

    @Override
    public List<HeaderItem> getDependencies()
    {
        List<HeaderItem> references = new ArrayList<>();
        
        SassResourceReference sassResourceReference = new SassResourceReference(HomePage.class, "custom.scss");
        references.add(CssHeaderItem.forReference(sassResourceReference));
        
        return references;
    }
}
