package com.bytedance.android.live.liveinteract.platform.common.e;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.core.Client;
import com.ss.avframework.livestreamv2.core.LiveCore;

public abstract class a implements Client.StreamMixer {

    /* renamed from: c  reason: collision with root package name */
    protected LiveCore.InteractConfig f11918c;

    static {
        Covode.recordClassIndex(6519);
    }

    public void a(LiveCore.InteractConfig interactConfig) {
        this.f11918c = interactConfig;
    }
}
