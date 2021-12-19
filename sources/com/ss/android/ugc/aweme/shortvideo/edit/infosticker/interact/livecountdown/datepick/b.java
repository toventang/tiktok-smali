package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick;

import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.h;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tools.c;
import com.ss.android.ugc.tools.utils.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.i;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

public final class b extends h {

    /* renamed from: a  reason: collision with root package name */
    public a f127391a;

    /* renamed from: b  reason: collision with root package name */
    public long f127392b;

    /* renamed from: c  reason: collision with root package name */
    public final long f127393c;

    /* renamed from: d  reason: collision with root package name */
    private final h.h f127394d = i.a((h.f.a.a) new C3311b(this));

    /* renamed from: e  reason: collision with root package name */
    private View f127395e;

    public interface a {
        static {
            Covode.recordClassIndex(83534);
        }

        void a(MotionEvent motionEvent);
    }

    static {
        Covode.recordClassIndex(83533);
    }

    public final DatePicker b() {
        return (DatePicker) this.f127394d.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.b$b  reason: collision with other inner class name */
    static final class C3311b extends m implements h.f.a.a<DatePicker> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(83535);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3311b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ DatePicker invoke() {
            return this.this$0.findViewById(R.id.aie);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        if (r1 >= ((float) r0.getHeight())) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            h.f.b.l.d(r5, r0)
            int r0 = r5.getAction()
            r3 = 1
            if (r0 != r3) goto L_0x004f
            float r0 = r5.getX()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0047
            float r0 = r5.getY()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0047
            float r1 = r5.getX()
            android.view.View r0 = r4.f127395e
            java.lang.String r2 = "content"
            if (r0 != 0) goto L_0x002a
            h.f.b.l.a(r2)
        L_0x002a:
            int r0 = r0.getWidth()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0047
            float r1 = r5.getY()
            android.view.View r0 = r4.f127395e
            if (r0 != 0) goto L_0x003e
            h.f.b.l.a(r2)
        L_0x003e:
            int r0 = r0.getHeight()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x004f
        L_0x0047:
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.b$a r0 = r4.f127391a
            if (r0 == 0) goto L_0x004e
            r0.a(r5)
        L_0x004e:
            return r3
        L_0x004f:
            boolean r0 = super.dispatchTouchEvent(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.b.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.appcompat.app.h
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ez);
        View findViewById = findViewById(R.id.dqe);
        if (findViewById == null) {
            l.b();
        }
        this.f127395e = findViewById;
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        if (this.f127392b == 0) {
            this.f127392b = System.currentTimeMillis();
        }
        DatePicker b2 = b();
        if (b2 != null) {
            long j2 = this.f127393c;
            com.a.a(b2.f127375e, R.layout.ey, b2, true);
            if (c.a(b2.getContext())) {
                View findViewById2 = b2.findViewById(R.id.cg1);
                l.b(findViewById2, "");
                findViewById2.setVisibility(8);
                View findViewById3 = b2.findViewById(R.id.cg2);
                l.b(findViewById3, "");
                findViewById3.setVisibility(0);
                View findViewById4 = b2.findViewById(R.id.cnh);
                Objects.requireNonNull(findViewById4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.LiveCDNumberPicker");
                b2.f127372b = (LiveCDNumberPicker) findViewById4;
                View findViewById5 = b2.findViewById(R.id.bh7);
                Objects.requireNonNull(findViewById5, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.LiveCDNumberPicker");
                b2.f127373c = (LiveCDNumberPicker) findViewById5;
                View findViewById6 = b2.findViewById(R.id.cmk);
                Objects.requireNonNull(findViewById6, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.LiveCDNumberPicker");
                b2.f127374d = (LiveCDNumberPicker) findViewById6;
            } else {
                View findViewById7 = b2.findViewById(R.id.cg1);
                l.b(findViewById7, "");
                findViewById7.setVisibility(0);
                View findViewById8 = b2.findViewById(R.id.cg2);
                l.b(findViewById8, "");
                findViewById8.setVisibility(8);
                View findViewById9 = b2.findViewById(R.id.cng);
                Objects.requireNonNull(findViewById9, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.LiveCDNumberPicker");
                b2.f127372b = (LiveCDNumberPicker) findViewById9;
                View findViewById10 = b2.findViewById(R.id.bh6);
                Objects.requireNonNull(findViewById10, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.LiveCDNumberPicker");
                b2.f127373c = (LiveCDNumberPicker) findViewById10;
                View findViewById11 = b2.findViewById(R.id.cmj);
                Objects.requireNonNull(findViewById11, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.LiveCDNumberPicker");
                b2.f127374d = (LiveCDNumberPicker) findViewById11;
            }
            b2.f127371a = new GregorianCalendar();
            Calendar calendar = b2.f127371a;
            if (calendar == null) {
                l.a("mCalendar");
            }
            calendar.setTimeInMillis(j2);
            LiveCDNumberPicker liveCDNumberPicker = b2.f127372b;
            if (liveCDNumberPicker == null) {
                l.a("mMonthDayPicker");
            }
            Context context = b2.getContext();
            l.b(context, "");
            Calendar calendar2 = b2.f127371a;
            if (calendar2 == null) {
                l.a("mCalendar");
            }
            e eVar = new e(context, calendar2);
            liveCDNumberPicker.f127381c = eVar;
            if (liveCDNumberPicker.f127381c == null) {
                liveCDNumberPicker.a();
                liveCDNumberPicker.invalidate();
            } else {
                liveCDNumberPicker.f127379a = eVar.b();
                liveCDNumberPicker.f127380b = eVar.a();
                liveCDNumberPicker.a();
                liveCDNumberPicker.invalidate();
                d dVar = liveCDNumberPicker.f127381c;
                if (dVar != null) {
                    dVar.f127397a = liveCDNumberPicker;
                }
            }
            LiveCDNumberPicker liveCDNumberPicker2 = b2.f127372b;
            if (liveCDNumberPicker2 == null) {
                l.a("mMonthDayPicker");
            }
            liveCDNumberPicker2.setTextAlign(Paint.Align.CENTER);
            LiveCDNumberPicker liveCDNumberPicker3 = b2.f127372b;
            if (liveCDNumberPicker3 == null) {
                l.a("mMonthDayPicker");
            }
            Context context2 = b2.getContext();
            l.b(context2, "");
            liveCDNumberPicker3.setMaxWidth((int) ((((float) r.a(b2.getContext())) / 2.0f) - r.a(context2, 80.0f)));
            LiveCDNumberPicker liveCDNumberPicker4 = b2.f127373c;
            if (liveCDNumberPicker4 == null) {
                l.a("mHoursPicker");
            }
            liveCDNumberPicker4.setTextAlign(Paint.Align.LEFT);
            LiveCDNumberPicker liveCDNumberPicker5 = b2.f127374d;
            if (liveCDNumberPicker5 == null) {
                l.a("mMinutesPicker");
            }
            liveCDNumberPicker5.setTextAlign(Paint.Align.LEFT);
            LiveCDNumberPicker liveCDNumberPicker6 = b2.f127372b;
            if (liveCDNumberPicker6 == null) {
                l.a("mMonthDayPicker");
            }
            DatePicker.a(30, liveCDNumberPicker6);
            LiveCDNumberPicker liveCDNumberPicker7 = b2.f127373c;
            if (liveCDNumberPicker7 == null) {
                l.a("mHoursPicker");
            }
            DatePicker.a(23, liveCDNumberPicker7);
            LiveCDNumberPicker liveCDNumberPicker8 = b2.f127374d;
            if (liveCDNumberPicker8 == null) {
                l.a("mMinutesPicker");
            }
            DatePicker.a(59, liveCDNumberPicker8);
            LiveCDNumberPicker liveCDNumberPicker9 = b2.f127372b;
            if (liveCDNumberPicker9 == null) {
                l.a("mMonthDayPicker");
            }
            b2.a(liveCDNumberPicker9);
            LiveCDNumberPicker liveCDNumberPicker10 = b2.f127373c;
            if (liveCDNumberPicker10 == null) {
                l.a("mHoursPicker");
            }
            b2.a(liveCDNumberPicker10);
            LiveCDNumberPicker liveCDNumberPicker11 = b2.f127374d;
            if (liveCDNumberPicker11 == null) {
                l.a("mMinutesPicker");
            }
            b2.a(liveCDNumberPicker11);
        }
        DatePicker b3 = b();
        if (b3 != null) {
            b3.setSelectTimeMiles(this.f127392b);
        }
    }

    public b(Context context, long j2) {
        super(context, R.style.f5);
        this.f127393c = j2;
    }
}
