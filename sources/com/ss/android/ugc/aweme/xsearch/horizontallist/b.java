package com.ss.android.ugc.aweme.xsearch.horizontallist;

import com.bytedance.covode.number.Covode;
import h.a.am;
import h.f.b.g;
import h.f.b.m;
import h.h;
import h.i;
import java.io.Serializable;
import java.util.Set;

public interface b {

    /* renamed from: a  reason: collision with root package name */
    public static final C3858b f145164a = C3858b.f145166b;

    static {
        Covode.recordClassIndex(94923);
    }

    public static final class a implements Serializable {
        @com.google.gson.a.c(a = "height")
        private float height;
        @com.google.gson.a.c(a = "width")
        private float width;
        @com.google.gson.a.c(a = "x")
        private float x;
        @com.google.gson.a.c(a = "y")
        private float y;

        static {
            Covode.recordClassIndex(94924);
        }

        public a() {
            this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        }

        public final float getHeight() {
            return this.height;
        }

        public final float getWidth() {
            return this.width;
        }

        public final float getX() {
            return this.x;
        }

        public final float getY() {
            return this.y;
        }

        public final void setHeight(float f2) {
            this.height = f2;
        }

        public final void setWidth(float f2) {
            this.width = f2;
        }

        public final void setX(float f2) {
            this.x = f2;
        }

        public final void setY(float f2) {
            this.y = f2;
        }

        public a(float f2, float f3, float f4, float f5) {
            this.x = f2;
            this.y = f3;
            this.width = f4;
            this.height = f5;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(float f2, float f3, float f4, float f5, int i2, g gVar) {
            this((i2 & 1) != 0 ? 0.0f : f2, (i2 & 2) != 0 ? 0.0f : f3, (i2 & 4) != 0 ? 0.0f : f4, (i2 & 8) != 0 ? 0.0f : f5);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.b$b  reason: collision with other inner class name */
    public static final class C3858b {

        /* renamed from: a  reason: collision with root package name */
        static final h f145165a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ C3858b f145166b;

        private C3858b() {
        }

        /* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.b$b$a */
        static final class a extends m implements h.f.a.a<Set<? extends String>> {
            final /* synthetic */ C3858b this$0;

            static {
                Covode.recordClassIndex(94926);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C3858b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Set<? extends String> invoke() {
                return am.a((Object[]) new String[]{"scroll", "scrolltoactive", "scrolltobounce"});
            }
        }

        static {
            Covode.recordClassIndex(94925);
            C3858b bVar = new C3858b();
            f145166b = bVar;
            f145165a = i.a((h.f.a.a) new a(bVar));
        }
    }

    public static final class c implements Serializable {
        @com.google.gson.a.c(a = "itemSpace")
        private float itemSpace;
        @com.google.gson.a.c(a = "leftMargin")
        private float leftMargin;
        @com.google.gson.a.c(a = "preferitemwidth")
        private float preferItemWidth;
        @com.google.gson.a.c(a = "rightMargin")
        private float rightMargin;

        static {
            Covode.recordClassIndex(94927);
        }

        public c() {
            this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        }

        public final float getItemSpace() {
            return this.itemSpace;
        }

        public final float getLeftMargin() {
            return this.leftMargin;
        }

        public final float getPreferItemWidth() {
            return this.preferItemWidth;
        }

        public final float getRightMargin() {
            return this.rightMargin;
        }

        public final void setItemSpace(float f2) {
            this.itemSpace = f2;
        }

        public final void setLeftMargin(float f2) {
            this.leftMargin = f2;
        }

        public final void setPreferItemWidth(float f2) {
            this.preferItemWidth = f2;
        }

        public final void setRightMargin(float f2) {
            this.rightMargin = f2;
        }

        public c(float f2, float f3, float f4, float f5) {
            this.leftMargin = f2;
            this.rightMargin = f3;
            this.itemSpace = f4;
            this.preferItemWidth = f5;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ c(float f2, float f3, float f4, float f5, int i2, g gVar) {
            this((i2 & 1) != 0 ? 0.0f : f2, (i2 & 2) != 0 ? 0.0f : f3, (i2 & 4) != 0 ? 0.0f : f4, (i2 & 8) != 0 ? 0.0f : f5);
        }
    }
}
