package com.ss.android.ugc.gamora.editor.toolbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.property.ad;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.tools.utils.r;
import h.f.b.l;
import h.f.b.m;
import h.h;

public final class SeekBarHelpLinearLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static final a f147009a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private float f147010b;

    /* renamed from: c  reason: collision with root package name */
    private com.ss.android.ugc.gamora.editor.progressbar.a f147011c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f147012d;

    /* renamed from: e  reason: collision with root package name */
    private final h f147013e;

    /* renamed from: f  reason: collision with root package name */
    private final h f147014f;

    static {
        Covode.recordClassIndex(96835);
    }

    private final int getBigSeekBarTouchY() {
        return ((Number) this.f147013e.getValue()).intValue();
    }

    private final int getScreenWidth() {
        return ((Number) this.f147014f.getValue()).intValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(96836);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f147015a = new b();

        static {
            Covode.recordClassIndex(96837);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf((int) r.a(40.0f));
        }
    }

    static final class c extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f147016a = new c();

        static {
            Covode.recordClassIndex(96838);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(r.a(i.f115645a));
        }
    }

    public final void setEditPreviewProgressApi(com.ss.android.ugc.gamora.editor.progressbar.a aVar) {
        this.f147011c = aVar;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        if (!ad.e()) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f147010b = motionEvent.getX();
            this.f147012d = false;
        } else if (action == 2 && a(motionEvent.getX(), motionEvent.getY())) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        com.ss.android.ugc.gamora.editor.progressbar.a aVar;
        float x;
        l.d(motionEvent, "");
        if (!ad.e()) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (a(motionEvent.getX(), motionEvent.getY()) && !this.f147012d) {
                        com.ss.android.ugc.gamora.editor.progressbar.a aVar2 = this.f147011c;
                        if (aVar2 != null) {
                            aVar2.b(1, 0);
                        }
                        this.f147012d = true;
                    }
                    if (this.f147012d) {
                        if (gb.a()) {
                            x = 100.0f - ((motionEvent.getX() * 100.0f) / ((float) getScreenWidth()));
                        } else {
                            x = (motionEvent.getX() * 100.0f) / ((float) getScreenWidth());
                        }
                        com.ss.android.ugc.gamora.editor.progressbar.a aVar3 = this.f147011c;
                        if (aVar3 != null) {
                            aVar3.b(2, (int) x);
                        }
                    }
                }
            } else if (this.f147012d && (aVar = this.f147011c) != null) {
                aVar.b(3, 0);
            }
            return super.onTouchEvent(motionEvent);
        }
        this.f147010b = motionEvent.getX();
        this.f147012d = false;
        if (((int) motionEvent.getY()) <= getBigSeekBarTouchY()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SeekBarHelpLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
        l.d(context, "");
    }

    private final boolean a(float f2, float f3) {
        if (Math.abs(this.f147010b - f2) < 50.0f || f3 >= ((float) getBigSeekBarTouchY())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SeekBarHelpLinearLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(3069);
        this.f147013e = h.i.a((h.f.a.a) b.f147015a);
        this.f147014f = h.i.a((h.f.a.a) c.f147016a);
        MethodCollector.o(3069);
    }
}
