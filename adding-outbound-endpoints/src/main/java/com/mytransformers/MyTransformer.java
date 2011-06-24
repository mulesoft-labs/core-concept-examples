package com.mytransformers;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

public class MyTransformer extends AbstractMessageTransformer{

	@Override
	public Object transformMessage(MuleMessage message, String arg1)
			throws TransformerException {
		String payload = ((String)(message.getPayload())).replaceAll("/", "");
		return payload;
	}
}
