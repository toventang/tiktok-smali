package com.ss.android.ugc.tools.view.style;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class StyleTabLayout extends TabLayout {
    public static final a v = new a((byte) 0);
    public TabLayout.c u;
    private int w;
    private int x;

    static {
        Covode.recordClassIndex(98820);
    }

    public StyleTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(98821);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements TabLayout.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StyleTabLayout f150133a;

        static {
            Covode.recordClassIndex(98822);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(StyleTabLayout styleTabLayout) {
            this.f150133a = styleTabLayout;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.c
        public final void a(TabLayout.f fVar) {
            l.d(fVar, "");
            if (this.f150133a.u != null) {
                TabLayout.c cVar = this.f150133a.u;
                if (cVar == null) {
                    l.b();
                }
                cVar.a(fVar);
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.c
        public final void b(TabLayout.f fVar) {
            l.d(fVar, "");
            if (this.f150133a.u != null) {
                TabLayout.c cVar = this.f150133a.u;
                if (cVar == null) {
                    l.b();
                }
                cVar.b(fVar);
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.c
        public final void c(TabLayout.f fVar) {
            l.d(fVar, "");
            if (this.f150133a.u != null) {
                TabLayout.c cVar = this.f150133a.u;
                if (cVar == null) {
                    l.b();
                }
                cVar.c(fVar);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout
    public final void a(TabLayout.c cVar) {
        l.d(cVar, "");
        this.u = cVar;
    }

    private /* synthetic */ StyleTabLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private StyleTabLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        this.w = context.getResources().getColor(R.color.ub);
        this.x = context.getResources().getColor(R.color.uc);
        setOverScrollMode(2);
        a(this.x, this.w);
        setSelectedTabIndicatorColor(this.w);
        setTabMargin(14);
        super.a(new b(this));
    }
}
