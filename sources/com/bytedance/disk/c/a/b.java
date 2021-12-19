package com.bytedance.disk.c.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.io.File;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public int f28532a = -1;

    /* renamed from: b  reason: collision with root package name */
    public String f28533b;

    /* renamed from: c  reason: collision with root package name */
    public int f28534c;

    /* renamed from: d  reason: collision with root package name */
    public int f28535d;

    /* renamed from: e  reason: collision with root package name */
    public int f28536e = -1;

    /* renamed from: f  reason: collision with root package name */
    private String f28537f;

    static {
        Covode.recordClassIndex(16774);
    }

    private boolean b() {
        File file = new File(this.f28537f);
        int i2 = this.f28536e;
        if (i2 == 1 || i2 == 2) {
            try {
                if (!file.exists()) {
                    return file.mkdirs();
                }
                return true;
            } catch (Exception unused) {
                return false;
            }
        } else {
            if (i2 == 0) {
                try {
                    File parentFile = file.getParentFile();
                    if (!parentFile.exists()) {
                        return parentFile.mkdirs();
                    }
                    return true;
                } catch (Exception unused2) {
                }
            }
            return false;
        }
    }

    public final String a() {
        if (TextUtils.isEmpty(this.f28537f)) {
            String str = null;
            int i2 = this.f28535d;
            if (i2 == 0) {
                str = com.bytedance.v.a.b.c();
            } else if (i2 == 1) {
                str = com.bytedance.v.a.b.b();
            } else if (i2 == 2) {
                str = com.bytedance.v.a.b.a();
            }
            if (!TextUtils.isEmpty(str)) {
                if (this.f28533b.startsWith("/")) {
                    this.f28537f = str + this.f28533b;
                } else {
                    this.f28537f = str + "/" + this.f28533b;
                }
            }
        }
        b();
        return this.f28537f;
    }

    public b(String str, int i2) {
        this.f28532a = Integer.valueOf(str.substring(0, 1)).intValue();
        this.f28536e = Integer.valueOf(str.substring(1, 2)).intValue();
        this.f28534c = Integer.valueOf(str.substring(2, 3)).intValue();
        this.f28535d = Integer.valueOf(str.substring(3, 4)).intValue();
        this.f28533b = str.substring(i2);
    }
}
