package com.ss.avframework.livestreamv2.sdkparams;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.tinyjson.NumberInitializer;
import com.ss.avframework.livestreamv2.tinyjson.Serialized;

public class KcpParams {
    @Serialized(name = "bwinit")
    public int bwinit = Integer.MAX_VALUE;
    @Serialized(name = "bwmin")
    public int bwmin = Integer.MAX_VALUE;
    @Serialized(name = "fast_ack")
    public int fastAck = Integer.MAX_VALUE;
    @Serialized(name = "fec")
    public int fec = Integer.MAX_VALUE;
    @Serialized(name = "jitter")
    public int jitter = Integer.MAX_VALUE;
    @Serialized(name = "logmask")
    public int logMask = Integer.MAX_VALUE;
    @Serialized(name = "lost")
    public double lost = NumberInitializer.UNDEFINED_DOUBLE_VALUE;
    @Serialized(name = "mtu_size")
    public int mtuSize = Integer.MAX_VALUE;
    @Serialized(name = "preempt")
    public int preempt = Integer.MAX_VALUE;
    @Serialized(name = "probebw")
    public int probebw = Integer.MAX_VALUE;
    @Serialized(name = "report")
    public int report = Integer.MAX_VALUE;
    @Serialized(name = "retrans")
    public int retrans = Integer.MAX_VALUE;
    @Serialized(name = "timeout")
    public int timeout = Integer.MAX_VALUE;
    @Serialized(name = "window")
    public int window = Integer.MAX_VALUE;
    @Serialized(name = "wnd_recv")
    public int wndRecv = Integer.MAX_VALUE;
    @Serialized(name = "wnd_send")
    public int wndSend = Integer.MAX_VALUE;

    static {
        Covode.recordClassIndex(100457);
    }
}
