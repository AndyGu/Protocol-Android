package com.joshdholtz.protocol.lib;

import android.graphics.Bitmap;

public abstract class ProtocolBitmapResponse {
	public abstract void handleResponse(String imageViewTag, Bitmap bitmap);
}
