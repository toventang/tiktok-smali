package com.ss.android.vesdk.runtime;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    protected String f151449a;

    /* renamed from: b  reason: collision with root package name */
    public List<String> f151450b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public List<String> f151451c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private String f151452d;

    /* renamed from: e  reason: collision with root package name */
    private String f151453e;

    static {
        Covode.recordClassIndex(99580);
    }

    public abstract String a();

    public String b() {
        return this.f151452d;
    }

    public String c() {
        return this.f151453e;
    }

    public final String f() {
        return this.f151449a + File.separator + "temp.mp4";
    }

    public final void d() {
        this.f151452d = f.a(this.f151449a, "concat") + File.separator + "concat.mp4";
    }

    public final void e() {
        this.f151453e = f.a(this.f151449a, "concat") + File.separator + "concat.wav";
    }

    public e(String str) {
        this.f151449a = str;
    }
}
