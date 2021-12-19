package com.ss.android.ugc.aweme.sticker.view.a;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import h.f.b.l;

public abstract class m {
    static {
        Covode.recordClassIndex(88962);
    }

    private m() {
    }

    public static final class a extends m {

        /* renamed from: a  reason: collision with root package name */
        public static final a f136211a = new a();

        private a() {
            super((byte) 0);
        }

        static {
            Covode.recordClassIndex(88963);
        }
    }

    public static final class b extends m {

        /* renamed from: a  reason: collision with root package name */
        public static final b f136212a = new b();

        private b() {
            super((byte) 0);
        }

        static {
            Covode.recordClassIndex(88964);
        }
    }

    public static final class c extends m {

        /* renamed from: a  reason: collision with root package name */
        public static final c f136213a = new c();

        private c() {
            super((byte) 0);
        }

        static {
            Covode.recordClassIndex(88965);
        }
    }

    public /* synthetic */ m(byte b2) {
        this();
    }

    public static final class f extends m {

        /* renamed from: a  reason: collision with root package name */
        public final View f136218a;

        static {
            Covode.recordClassIndex(88968);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof f) && l.a(this.f136218a, ((f) obj).f136218a);
            }
            return true;
        }

        public final int hashCode() {
            View view = this.f136218a;
            if (view != null) {
                return view.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "ViewCreated(stickerView=" + this.f136218a + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(View view) {
            super((byte) 0);
            l.d(view, "");
            this.f136218a = view;
        }
    }

    public static final class d extends m {

        /* renamed from: a  reason: collision with root package name */
        public final EffectCategoryModel f136214a;

        /* renamed from: b  reason: collision with root package name */
        public final int f136215b;

        static {
            Covode.recordClassIndex(88966);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return l.a(this.f136214a, dVar.f136214a) && this.f136215b == dVar.f136215b;
        }

        public final int hashCode() {
            EffectCategoryModel effectCategoryModel = this.f136214a;
            return ((effectCategoryModel != null ? effectCategoryModel.hashCode() : 0) * 31) + this.f136215b;
        }

        public final String toString() {
            return "TabChanged(tab=" + this.f136214a + ", index=" + this.f136215b + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(EffectCategoryModel effectCategoryModel, int i2) {
            super((byte) 0);
            l.d(effectCategoryModel, "");
            this.f136214a = effectCategoryModel;
            this.f136215b = i2;
        }
    }

    public static final class e extends m {

        /* renamed from: a  reason: collision with root package name */
        public final EffectCategoryModel f136216a;

        /* renamed from: b  reason: collision with root package name */
        public final int f136217b;

        static {
            Covode.recordClassIndex(88967);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return l.a(this.f136216a, eVar.f136216a) && this.f136217b == eVar.f136217b;
        }

        public final int hashCode() {
            EffectCategoryModel effectCategoryModel = this.f136216a;
            return ((effectCategoryModel != null ? effectCategoryModel.hashCode() : 0) * 31) + this.f136217b;
        }

        public final String toString() {
            return "TabClick(tab=" + this.f136216a + ", index=" + this.f136217b + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(EffectCategoryModel effectCategoryModel, int i2) {
            super((byte) 0);
            l.d(effectCategoryModel, "");
            this.f136216a = effectCategoryModel;
            this.f136217b = i2;
        }
    }
}
