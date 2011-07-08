package org.mule.examples.hello;

import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;

public class StripPathTransformer extends AbstractTransformer{

	@Override
	protected Object doTransform(Object payload, String encoding) throws TransformerException {
		String s = payload.toString();
		return s.substring(s.lastIndexOf("/") + 1);
	}
}
