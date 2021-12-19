package com.ss.android.ugc.aweme.dsp.playerservice.b;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.concurrent.CopyOnWriteArraySet;

public final class b {
    @c(a = "expired_playable")

    /* renamed from: a  reason: collision with root package name */
    public CopyOnWriteArraySet<String> f83370a = new CopyOnWriteArraySet<>();
    @c(a = "expired_full_clip_ids")

    /* renamed from: b  reason: collision with root package name */
    public CopyOnWriteArraySet<String> f83371b = new CopyOnWriteArraySet<>();
    @c(a = "current_date")

    /* renamed from: c  reason: collision with root package name */
    public final long f83372c = System.currentTimeMillis();
    @c(a = "last_expired_playable_id")

    /* renamed from: d  reason: collision with root package name */
    public String f83373d = "";
    @c(a = "limited_notification_pushed")

    /* renamed from: e  reason: collision with root package name */
    public boolean f83374e;

    static {
        Covode.recordClassIndex(52033);
    }
}
