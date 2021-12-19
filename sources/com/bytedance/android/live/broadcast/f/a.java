package com.bytedance.android.live.broadcast.f;

import android.os.Message;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.broadcast.b.f;
import com.bytedance.android.live.broadcast.utils.d;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.chatroom.f.c;
import com.bytedance.android.livesdk.model.message.bv;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a.b;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class a extends b<AbstractC0113a> implements WeakHandler.IHandler {

    /* renamed from: i  reason: collision with root package name */
    private static final Spannable f7851i = new SpannableString("");

    /* renamed from: a  reason: collision with root package name */
    String f7852a;

    /* renamed from: b  reason: collision with root package name */
    public long f7853b;

    /* renamed from: c  reason: collision with root package name */
    public WeakHandler f7854c;

    /* renamed from: d  reason: collision with root package name */
    public int f7855d = 1;

    /* renamed from: e  reason: collision with root package name */
    public boolean f7856e;

    /* renamed from: f  reason: collision with root package name */
    int f7857f;

    /* renamed from: g  reason: collision with root package name */
    int f7858g;

    /* renamed from: h  reason: collision with root package name */
    public f f7859h;

    /* renamed from: j  reason: collision with root package name */
    private int f7860j = 10;

    /* renamed from: k  reason: collision with root package name */
    private String f7861k;

    /* renamed from: l  reason: collision with root package name */
    private f.a.b.b f7862l;

    /* renamed from: com.bytedance.android.live.broadcast.f.a$a  reason: collision with other inner class name */
    public interface AbstractC0113a extends com.bytedance.ies.a.a {
        static {
            Covode.recordClassIndex(3887);
        }

        void a(CharSequence charSequence);

        void a(boolean z);

        void a(boolean z, String str);

        void b(CharSequence charSequence);

        void l();

        void m();

        void n();

        void o();
    }

    static {
        Covode.recordClassIndex(3886);
    }

    @Override // com.bytedance.ies.a.b
    public final void b() {
        super.b();
        this.f7854c.removeMessages(1);
        this.f7854c.removeMessages(2);
    }

    public final void a() {
        if (this.y != null) {
            ((AbstractC0113a) this.y).m();
            com.bytedance.android.livesdk.chatroom.b.f.a(this.f7854c, this.f7853b);
        }
    }

    public final void c() {
        this.f7854c.removeMessages(1);
        this.f7854c.removeMessages(2);
        this.f7855d = 1;
        f.a.b.b bVar = this.f7862l;
        if (bVar != null) {
            bVar.dispose();
            this.f7862l = null;
        }
        if (this.y != null) {
            ((AbstractC0113a) this.y).a(false);
            this.f7856e = false;
        }
        f fVar = this.f7859h;
        if (fVar != null) {
            fVar.dismiss();
        }
    }

    public a(long j2) {
        this.f7853b = j2;
        this.f7854c = new WeakHandler(this);
        this.f7852a = y.a((int) R.string.gpg) + "（%ds）";
    }

    private static CharSequence b(bv bvVar) {
        Spannable spannable;
        Spannable spannable2 = f7851i;
        c.a(bvVar.f19371i, "");
        if (bvVar.a()) {
            spannable = c.a(bvVar.O.f23218j, "");
        } else {
            spannable = spannable2;
        }
        if (spannable != spannable2 || TextUtils.isEmpty(bvVar.f19367a)) {
            return spannable;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(y.a((int) R.string.gzh));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(y.b((int) R.color.yi)), 8, spannableStringBuilder.length(), 33);
        spannableStringBuilder.insert(0, (CharSequence) (y.a((int) R.string.gv5) + bvVar.f19367a + "\n"));
        return spannableStringBuilder;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (this.y != null && this.f7855d != 1) {
            int i2 = message.what;
            if (i2 == 1) {
                ((AbstractC0113a) this.y).o();
            } else if (i2 == 2) {
                d.a.a().a().getReviewInfo(this.f7853b).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new f(this), new g(this));
            } else if (i2 == 25 && (message.obj instanceof com.bytedance.android.live.a.a.a) && this.y != null) {
                c();
            }
        }
    }

    public final void a(bv bvVar) {
        if (this.y != null && bvVar != null) {
            if (2 == bvVar.f19368f && this.f7855d == 1) {
                this.f7855d = 2;
                this.f7860j = 10;
                this.f7861k = bvVar.f19367a;
                ((AbstractC0113a) this.y).a(y.a((int) R.string.gph));
                ((AbstractC0113a) this.y).b(b(bvVar));
                String a2 = com.a.a(Locale.getDefault(), this.f7852a, new Object[]{Integer.valueOf(this.f7860j)});
                ((AbstractC0113a) this.y).l();
                ((AbstractC0113a) this.y).a(false, a2);
                ((AbstractC0113a) this.y).a(true);
                this.f7854c.sendEmptyMessageDelayed(1, 600000);
                f.a.b.b bVar = this.f7862l;
                if (bVar == null || bVar.isDisposed()) {
                    this.f7862l = com.bytedance.android.livesdk.utils.b.b.a(TimeUnit.MILLISECONDS).a(new com.bytedance.android.livesdk.util.rxutils.f()).b(new b(this)).d(new c(this));
                }
            } else if (3 == bvVar.f19368f && this.f7855d != 1) {
                if (this.y != null) {
                    ((AbstractC0113a) this.y).n();
                }
                c();
            }
        }
    }
}
