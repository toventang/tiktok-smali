package com.ttnet.org.chromium.base;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;

public abstract class CommandLine {

    /* renamed from: a  reason: collision with root package name */
    static final AtomicReference<CommandLine> f155128a = new AtomicReference<>();

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ boolean f155129b = true;

    public static native void nativeAppendSwitch(String str);

    public static native void nativeAppendSwitchWithValue(String str, String str2);

    public static native void nativeAppendSwitchesAndArguments(String[] strArr);

    public static native String nativeGetSwitchValue(String str);

    public static native boolean nativeHasSwitch(String str);

    public static native void nativeInit(String[] strArr);

    public abstract boolean a();

    private CommandLine() {
    }

    static {
        Covode.recordClassIndex(103253);
    }

    public static CommandLine b() {
        CommandLine commandLine = f155128a.get();
        if (f155129b || commandLine != null) {
            return commandLine;
        }
        throw new AssertionError();
    }
}
