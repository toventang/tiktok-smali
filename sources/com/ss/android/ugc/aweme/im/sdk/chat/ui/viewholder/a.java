package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.content.Context;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxCheckBox;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.b.d;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemContent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.like.ui.f;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.d.a;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.m;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ae;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public abstract class a<CONTENT extends BaseContent> extends RecyclerView.ViewHolder implements i, j {

    /* renamed from: a  reason: collision with root package name */
    private TextView f101310a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f101311b;

    /* renamed from: c  reason: collision with root package name */
    public int f101312c = 7;

    /* renamed from: d  reason: collision with root package name */
    protected int f101313d;

    /* renamed from: e  reason: collision with root package name */
    public AvatarImageView f101314e;

    /* renamed from: f  reason: collision with root package name */
    public TuxCheckBox f101315f;

    /* renamed from: g  reason: collision with root package name */
    public FrameLayout f101316g;

    /* renamed from: h  reason: collision with root package name */
    public TextView f101317h;

    /* renamed from: i  reason: collision with root package name */
    protected TextView f101318i;

    /* renamed from: j  reason: collision with root package name */
    protected TuxIconView f101319j;

    /* renamed from: k  reason: collision with root package name */
    public View f101320k;

    /* renamed from: l  reason: collision with root package name */
    public f f101321l;

    /* renamed from: m  reason: collision with root package name */
    protected String f101322m;
    protected String n;
    protected com.ss.android.ugc.aweme.im.sdk.chat.ui.d.a o;
    protected CONTENT p;
    public int q;
    protected SystemContent r;
    public ai s;
    protected ae.a t;
    protected d.a u;
    public String v;
    int[] w = new int[2];
    private final GestureDetector.SimpleOnGestureListener x;
    private GestureDetector y;

    static {
        Covode.recordClassIndex(64797);
    }

    /* access modifiers changed from: package-private */
    public void a(ai aiVar) {
    }

    /* access modifiers changed from: protected */
    public b<Boolean, z> bC_() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void bD_() {
    }

    /* access modifiers changed from: protected */
    public void bE_() {
    }

    public void g() {
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(73, new g(a.class, "onUserUpdate", m.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public final void a(com.ss.android.ugc.aweme.im.sdk.chat.data.a aVar) {
        ViewGroup viewGroup = (ViewGroup) a((int) R.id.cf5);
        if (viewGroup != null) {
            int i2 = this.f101312c;
            b<Boolean, z> bC_ = bC_();
            l.d(viewGroup, "");
            l.d(aVar, "");
            l.d(viewGroup, "");
            l.d(aVar, "");
            this.f101321l = new com.ss.android.ugc.aweme.im.sdk.chat.feature.like.ui.d(viewGroup, i2, bC_);
        }
    }

    public void a(IMUser iMUser, ai aiVar) {
        this.v = null;
        if (iMUser != null) {
            a(aiVar, iMUser);
            TextView textView = this.f101317h;
            if (textView != null) {
                textView.setVisibility(8);
            }
        } else if (aiVar != null) {
            this.v = String.valueOf(aiVar.getSender());
            com.ss.android.ugc.aweme.im.sdk.common.controller.e.g.a(String.valueOf(aiVar.getSender()), aiVar.getSecSender());
        }
    }

    public final void a(ai aiVar, boolean z) {
        if (this.f101321l != null) {
            aiVar.isSelf();
            com.ss.android.ugc.aweme.im.service.m.a.b("DmHelper", "bindLikedStatusForDm dmLikePanel :" + this.f101312c);
            this.f101321l.a(aiVar, z);
            return;
        }
        com.ss.android.ugc.aweme.im.service.m.a.b("DmHelper", "dmLikePanel is null. do nothing:" + this.f101312c);
    }

    public final void f() {
        if (EventBus.a().a(this)) {
            EventBus.a().b(this);
        }
    }

    public final void e() {
        if (!TextUtils.isEmpty(this.v) && !EventBus.a().a(this)) {
            EventBus.a(EventBus.a(), this);
        }
        if (this.f101318i != null) {
            CONTENT content = this.p;
            if (content == null || content.getExtContent() == null) {
                SystemContent systemContent = this.r;
                if (systemContent != null) {
                    d.a(systemContent);
                    return;
                }
                return;
            }
            d.a(this.p.getExtContent());
        }
    }

    public final void h() {
        GestureDetector gestureDetector = this.y;
        if (gestureDetector != null) {
            com.ss.android.ugc.aweme.im.sdk.chat.ui.d.a aVar = this.o;
            if (aVar != null) {
                l.d(gestureDetector, "");
                aVar.f101207c.setOnTouchListener(new a.b(aVar, gestureDetector));
                return;
            }
            com.ss.android.ugc.aweme.im.service.m.a.c("IMBaseViewHolder", "confirmClickListener fail with type:" + this.f101312c);
            return;
        }
        com.ss.android.ugc.aweme.framework.a.a.a((Exception) new IllegalStateException("confirmClickListener but gestureDetector is null"));
    }

    public void a() {
        this.f101318i = (TextView) a((int) R.id.cwq);
        this.f101311b = (TextView) a((int) R.id.cor);
        this.f101317h = (TextView) a((int) R.id.fdm);
        this.f101314e = (AvatarImageView) a((int) R.id.pf);
        this.f101320k = (View) a((int) R.id.fj7);
        this.f101315f = (TuxCheckBox) a((int) R.id.a3c);
        this.f101316g = (FrameLayout) a((int) R.id.c7x);
        this.f101310a = (TextView) a((int) R.id.fc7);
    }

    /* access modifiers changed from: package-private */
    public final <T> T a(int i2) {
        T t2 = (T) this.itemView.findViewById(i2);
        if (t2 != null) {
            return t2;
        }
        return null;
    }

    public static boolean b(ai aiVar) {
        if (aiVar == null) {
            return false;
        }
        if (aiVar.getMsgStatus() == 2 || aiVar.getMsgStatus() == 5) {
            return true;
        }
        return false;
    }

    public void a(View.OnClickListener onClickListener) {
        AvatarImageView avatarImageView = this.f101314e;
        if (avatarImageView != null) {
            avatarImageView.setOnClickListener(onClickListener);
        }
        com.ss.android.ugc.aweme.im.sdk.chat.ui.d.a aVar = this.o;
        if (aVar != null) {
            aVar.a(onClickListener);
        }
    }

    public void a(View.OnLongClickListener onLongClickListener) {
        AvatarImageView avatarImageView = this.f101314e;
        if (avatarImageView != null) {
            avatarImageView.setOnLongClickListener(onLongClickListener);
        }
        com.ss.android.ugc.aweme.im.sdk.chat.ui.d.a aVar = this.o;
        if (aVar != null) {
            aVar.a(onLongClickListener);
        }
    }

    public a(View view) {
        super(view);
        AnonymousClass1 r2 = new GestureDetector.SimpleOnGestureListener() {
            /* class com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(64798);
            }

            public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
                return true;
            }

            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                return super.onSingleTapUp(motionEvent);
            }

            public final boolean onDoubleTap(MotionEvent motionEvent) {
                if (a.this.f101321l == null) {
                    return true;
                }
                a.this.f101321l.a(motionEvent.getRawX(), motionEvent.getRawY());
                return true;
            }

            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                com.ss.android.ugc.aweme.im.service.m.a.c("DmHelper", "onSingleTapConfirmed called");
                int rawX = (int) motionEvent.getRawX();
                int rawY = (int) motionEvent.getRawY();
                a aVar = a.this;
                View view = aVar.o.f101207c;
                view.getLocationOnScreen(aVar.w);
                int i2 = aVar.w[0];
                int i3 = aVar.w[1];
                int width = view.getWidth();
                int height = view.getHeight();
                if (rawX >= i2 && rawX <= i2 + width && rawY >= i3 && rawY <= i3 + height) {
                    View.OnClickListener onClickListener = a.this.o.f101205a;
                    com.ss.android.ugc.aweme.im.service.m.a.c("DmHelper", "onSingleTapConfirmed called:".concat(String.valueOf(onClickListener)));
                    if (onClickListener != null) {
                        onClickListener.onClick(a.this.o.f101207c);
                    }
                }
                return super.onSingleTapConfirmed(motionEvent);
            }
        };
        this.x = r2;
        this.y = null;
        Context context = this.itemView.getContext();
        this.q = 0;
        this.f101313d = (int) n.b(context, 8.0f);
        this.t = new ae.a();
        this.y = new GestureDetector(context, r2);
        this.u = d.a(androidx.core.content.b.c(context, R.color.b9), this.f101322m, this.n, false);
        a();
        bD_();
    }

    @r
    public void onUserUpdate(m mVar) {
        IMUser a2;
        if (TextUtils.equals(this.v, mVar.f102282a) && (a2 = com.ss.android.ugc.aweme.im.sdk.common.controller.e.g.a(mVar.f102282a, mVar.f102283b)) != null) {
            UrlModel avatarThumb = a2.getAvatarThumb();
            if (avatarThumb == null || avatarThumb.getUrlList() == null || avatarThumb.getUrlList().size() == 0) {
                e.a(this.f101314e, 2131232324);
            } else {
                com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a.a(this.f101314e, avatarThumb);
            }
            this.f101317h.setText(a2.getDisplayName());
        }
    }

    public final void a(View.OnTouchListener onTouchListener) {
        AvatarImageView avatarImageView = this.f101314e;
        if (avatarImageView != null) {
            avatarImageView.setOnTouchListener(onTouchListener);
        }
        com.ss.android.ugc.aweme.im.sdk.chat.ui.d.a aVar = this.o;
        if (aVar != null) {
            aVar.a(onTouchListener);
        }
    }

    public static void a(View view, int i2) {
        if (view != null) {
            view.setVisibility(i2);
        }
    }

    public void a(ai aiVar, ReferenceInfo referenceInfo) {
        if (referenceInfo != null) {
            com.ss.android.ugc.aweme.im.service.m.a.c("IMBaseViewHolder", "bindReplyMessage not implemented");
        }
    }

    public final void a(ai aiVar, IMContact iMContact) {
        AvatarImageView avatarImageView = this.f101314e;
        if (avatarImageView != null) {
            avatarImageView.setTag(67108864, String.valueOf(aiVar.getSender()));
            this.f101314e.setTag(50331648, 3);
            this.t.a(this.f101314e);
            com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a.a(this.f101314e, iMContact.getDisplayAvatar());
            com.ss.android.ugc.aweme.im.sdk.common.controller.utils.a.a(this.f101314e, iMContact);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x014a A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(final com.bytedance.im.core.d.ai r10, com.bytedance.im.core.d.ai r11, CONTENT r12, int r13) {
        /*
        // Method dump skipped, instructions count: 425
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a.a(com.bytedance.im.core.d.ai, com.bytedance.im.core.d.ai, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent, int):void");
    }
}
