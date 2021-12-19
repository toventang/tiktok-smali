package com.vk.api.sdk.a;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class d {

    /* renamed from: d  reason: collision with root package name */
    public static final a f156221d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Set<f> f156222a;

    /* renamed from: b  reason: collision with root package name */
    public final int f156223b;

    /* renamed from: c  reason: collision with root package name */
    public final String f156224c;

    static {
        Covode.recordClassIndex(103753);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(103754);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("vk_app_id", this.f156223b);
        Set<f> set = this.f156222a;
        ArrayList arrayList = new ArrayList(n.a(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().name());
        }
        bundle.putStringArrayList("vk_app_scope", new ArrayList<>(arrayList));
        bundle.putString("vk_app_redirect_url", this.f156224c);
        return bundle;
    }

    public /* synthetic */ d(int i2, Collection collection) {
        this(i2, "https://oauth.vk.com/blank.html", collection);
    }

    public d(int i2, String str, Collection<? extends f> collection) {
        l.c(str, "");
        l.c(collection, "");
        this.f156223b = i2;
        this.f156224c = str;
        if (i2 != 0) {
            this.f156222a = new HashSet(collection);
            return;
        }
        throw new IllegalStateException("AppId is empty! Find out how to get your appId at https://vk.com/dev/access_token");
    }
}
