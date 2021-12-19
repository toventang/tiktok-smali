package com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.c;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f135966a;

    /* renamed from: b  reason: collision with root package name */
    public String f135967b;

    /* renamed from: c  reason: collision with root package name */
    public String f135968c;

    /* renamed from: d  reason: collision with root package name */
    public List<String> f135969d;

    static {
        Covode.recordClassIndex(88833);
    }

    public final String a() {
        List<String> list = this.f135969d;
        if (list == null) {
            l.b();
        }
        if (list.isEmpty() || TextUtils.isEmpty(this.f135967b)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        List<String> list2 = this.f135969d;
        if (list2 == null) {
            l.b();
        }
        StringBuilder append = sb.append(list2.get(0));
        String str = this.f135967b;
        if (str == null) {
            l.b();
        }
        return append.append(str).toString();
    }

    public final String b() {
        List<String> list = this.f135969d;
        if (list == null || list.isEmpty() || TextUtils.isEmpty(this.f135966a)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        List<String> list2 = this.f135969d;
        if (list2 == null) {
            l.b();
        }
        StringBuilder append = sb.append(list2.get(0));
        String str = this.f135966a;
        if (str == null) {
            l.b();
        }
        return append.append(str).toString();
    }
}
