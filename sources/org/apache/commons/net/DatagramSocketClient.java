package org.apache.commons.net;

import com.bytedance.covode.number.Covode;
import java.net.DatagramSocket;
import java.nio.charset.Charset;

public abstract class DatagramSocketClient {
    private static final DatagramSocketFactory __DEFAULT_SOCKET_FACTORY = new DefaultDatagramSocketFactory();
    protected boolean _isOpen_ = false;
    protected DatagramSocketFactory _socketFactory_ = __DEFAULT_SOCKET_FACTORY;
    protected DatagramSocket _socket_ = null;
    protected int _timeout_ = 0;
    private Charset charset = Charset.defaultCharset();

    public boolean isOpen() {
        return this._isOpen_;
    }

    static {
        Covode.recordClassIndex(106359);
    }

    public void open() {
        DatagramSocket createDatagramSocket = this._socketFactory_.createDatagramSocket();
        this._socket_ = createDatagramSocket;
        createDatagramSocket.setSoTimeout(this._timeout_);
        this._isOpen_ = true;
    }

    public void setDefaultTimeout(int i2) {
        this._timeout_ = i2;
    }
}
