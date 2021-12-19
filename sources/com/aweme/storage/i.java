package com.aweme.storage;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.List;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public String f5985a;

    /* renamed from: b  reason: collision with root package name */
    public String f5986b;

    /* renamed from: c  reason: collision with root package name */
    public long f5987c;

    /* renamed from: d  reason: collision with root package name */
    public List<a> f5988d;

    static {
        Covode.recordClassIndex(2812);
    }

    public final void a() {
        List<a> list;
        if (!(TextUtils.isEmpty(this.f5985a) || (list = this.f5988d) == null || list.isEmpty())) {
            for (a aVar : this.f5988d) {
                if (aVar != null) {
                    aVar.a(this.f5985a);
                }
            }
            this.f5987c = e.a(this.f5985a);
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f5989a;

        /* renamed from: b  reason: collision with root package name */
        public String f5990b;

        /* renamed from: c  reason: collision with root package name */
        public long f5991c;

        /* renamed from: d  reason: collision with root package name */
        public File f5992d;

        static {
            Covode.recordClassIndex(2813);
        }

        public final void a(String str) {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.f5989a)) {
                String str2 = str + File.separator + this.f5989a;
                File file = new File(str2);
                this.f5992d = file;
                if (file.exists()) {
                    this.f5991c = e.a(str2);
                }
            }
        }

        public a(String str, String str2) {
            this.f5990b = str2;
            this.f5989a = str;
        }
    }

    public i(String str, String str2) {
        this.f5986b = str;
        this.f5985a = str2;
    }

    public i(String str, String str2, List<a> list) {
        this.f5986b = str;
        this.f5985a = str2;
        this.f5988d = list;
    }
}
