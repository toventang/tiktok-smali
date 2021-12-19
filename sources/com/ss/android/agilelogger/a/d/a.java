package com.ss.android.agilelogger.a.d;

import com.bytedance.covode.number.Covode;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final String f59107a = "Thread: ";

    static {
        Covode.recordClassIndex(36545);
    }

    @Override // com.ss.android.agilelogger.a.b
    public final /* synthetic */ String a(Object obj) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Thread: ");
        stringBuffer.append(((Thread) obj).getName());
        return stringBuffer.toString();
    }
}
