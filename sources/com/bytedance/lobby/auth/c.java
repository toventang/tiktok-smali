package com.bytedance.lobby.auth;

import android.os.Bundle;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final e f40166a;

    /* renamed from: b  reason: collision with root package name */
    public final String f40167b;

    /* renamed from: c  reason: collision with root package name */
    public final a f40168c;

    /* renamed from: d  reason: collision with root package name */
    public final Bundle f40169d;

    static {
        Covode.recordClassIndex(24755);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f40170a;

        /* renamed from: b  reason: collision with root package name */
        public e f40171b;

        /* renamed from: c  reason: collision with root package name */
        public a f40172c;

        /* renamed from: d  reason: collision with root package name */
        public Bundle f40173d;

        static {
            Covode.recordClassIndex(24756);
        }

        public final c a() {
            return new c(this, (byte) 0);
        }

        public a(e eVar) {
            this.f40171b = eVar;
        }

        public final a a(Bundle bundle) {
            Bundle bundle2 = this.f40173d;
            if (bundle2 == null) {
                this.f40173d = bundle;
            } else {
                bundle2.putAll(bundle);
            }
            return this;
        }
    }

    private c(a aVar) {
        this.f40167b = aVar.f40170a;
        this.f40166a = aVar.f40171b;
        this.f40168c = aVar.f40172c;
        this.f40169d = aVar.f40173d;
    }

    /* synthetic */ c(a aVar, byte b2) {
        this(aVar);
    }
}
