package com.ss.avframework.livestreamv2.sdkparams;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.tinyjson.Serialized;

public final class QuicParams {
    @Serialized(name = "adapt_est_bw_to_quic_bw")
    private int adatEstBwToQuicBw = Integer.MAX_VALUE;
    @Serialized(name = "bw_window_size")
    private int bwWindowSize = Integer.MAX_VALUE;
    @Serialized(name = "congestion_type")
    private int congestionType = Integer.MAX_VALUE;
    @Serialized(name = "default_retransmit_time")
    private int defaultRetransmitTime = Integer.MAX_VALUE;
    @Serialized(name = "enable_cert_verify")
    private int enableCertVerify = Integer.MAX_VALUE;
    @Serialized(name = "enable_mtu_discovery")
    private int enableMtuDiscovery = Integer.MAX_VALUE;
    @Serialized(name = "enable_save_scfg")
    private int enableSaveScfg = Integer.MAX_VALUE;
    @Serialized(name = "fix_packet_writer")
    private int fixPacketWriter = Integer.MAX_VALUE;
    @Serialized(name = "fix_stream_fin_and_rst")
    private int fixStreamFinAndRst = Integer.MAX_VALUE;
    @Serialized(name = "ignore_socket_write_error")
    private int ignoreSocketWriterError = Integer.MAX_VALUE;
    @Serialized(name = "init_cwnd")
    private int initCwnd = Integer.MAX_VALUE;
    @Serialized(name = "init_mtu")
    private int initMtu = Integer.MAX_VALUE;
    @Serialized(name = "log_level")
    private int logLevel = Integer.MAX_VALUE;
    @Serialized(name = "loss_detection_type")
    private int lossDetectionType = Integer.MAX_VALUE;
    @Serialized(name = "probe_bw_random_cycle_length")
    private int probeBwRandomCycleLength = Integer.MAX_VALUE;
    @Serialized(name = "probe_rtt_gain")
    private int probeRttGain = Integer.MAX_VALUE;
    @Serialized(name = "quic_version")
    private int quicVersion = Integer.MAX_VALUE;
    @Serialized(name = "recv_buffer_size")
    private int recvBufferSize = Integer.MAX_VALUE;
    @Serialized(name = "rtt_window_size")
    private int rttWindowSize = Integer.MAX_VALUE;
    @Serialized(name = "send_buffer_size")
    private int sendBufferSize = Integer.MAX_VALUE;

    static {
        Covode.recordClassIndex(100465);
    }

    public final int getAdatEstBwToQuicBw() {
        return this.adatEstBwToQuicBw;
    }

    public final int getBwWindowSize() {
        return this.bwWindowSize;
    }

    public final int getCongestionType() {
        return this.congestionType;
    }

    public final int getDefaultRetransmitTime() {
        return this.defaultRetransmitTime;
    }

    public final int getEnableCertVerify() {
        return this.enableCertVerify;
    }

    public final int getEnableMtuDiscovery() {
        return this.enableMtuDiscovery;
    }

    public final int getEnableSaveScfg() {
        return this.enableSaveScfg;
    }

    public final int getFixPacketWriter() {
        return this.fixPacketWriter;
    }

    public final int getFixStreamFinAndRst() {
        return this.fixStreamFinAndRst;
    }

    public final int getIgnoreSocketWriterError() {
        return this.ignoreSocketWriterError;
    }

    public final int getInitCwnd() {
        return this.initCwnd;
    }

    public final int getInitMtu() {
        return this.initMtu;
    }

    public final int getLogLevel() {
        return this.logLevel;
    }

    public final int getLossDetectionType() {
        return this.lossDetectionType;
    }

    public final int getProbeBwRandomCycleLength() {
        return this.probeBwRandomCycleLength;
    }

    public final int getProbeRttGain() {
        return this.probeRttGain;
    }

    public final int getQuicVersion() {
        return this.quicVersion;
    }

    public final int getRecvBufferSize() {
        return this.recvBufferSize;
    }

    public final int getRttWindowSize() {
        return this.rttWindowSize;
    }

    public final int getSendBufferSize() {
        return this.sendBufferSize;
    }

    public final void setAdatEstBwToQuicBw(int i2) {
        this.adatEstBwToQuicBw = i2;
    }

    public final void setBwWindowSize(int i2) {
        this.bwWindowSize = i2;
    }

    public final void setCongestionType(int i2) {
        this.congestionType = i2;
    }

    public final void setDefaultRetransmitTime(int i2) {
        this.defaultRetransmitTime = i2;
    }

    public final void setEnableCertVerify(int i2) {
        this.enableCertVerify = i2;
    }

    public final void setEnableMtuDiscovery(int i2) {
        this.enableMtuDiscovery = i2;
    }

    public final void setEnableSaveScfg(int i2) {
        this.enableSaveScfg = i2;
    }

    public final void setFixPacketWriter(int i2) {
        this.fixPacketWriter = i2;
    }

    public final void setFixStreamFinAndRst(int i2) {
        this.fixStreamFinAndRst = i2;
    }

    public final void setIgnoreSocketWriterError(int i2) {
        this.ignoreSocketWriterError = i2;
    }

    public final void setInitCwnd(int i2) {
        this.initCwnd = i2;
    }

    public final void setInitMtu(int i2) {
        this.initMtu = i2;
    }

    public final void setLogLevel(int i2) {
        this.logLevel = i2;
    }

    public final void setLossDetectionType(int i2) {
        this.lossDetectionType = i2;
    }

    public final void setProbeBwRandomCycleLength(int i2) {
        this.probeBwRandomCycleLength = i2;
    }

    public final void setProbeRttGain(int i2) {
        this.probeRttGain = i2;
    }

    public final void setQuicVersion(int i2) {
        this.quicVersion = i2;
    }

    public final void setRecvBufferSize(int i2) {
        this.recvBufferSize = i2;
    }

    public final void setRttWindowSize(int i2) {
        this.rttWindowSize = i2;
    }

    public final void setSendBufferSize(int i2) {
        this.sendBufferSize = i2;
    }
}
