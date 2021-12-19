package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.im.core.d.ai;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.experiment.q;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.chat.b.c.b;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareStoryContent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.d.a;
import com.ss.android.ugc.aweme.im.sdk.common.data.api.a;
import com.ss.android.ugc.aweme.im.sdk.common.ui.widget.KeepSurfaceTextureView;
import com.ss.android.ugc.aweme.story.g;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.z;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.i;

public class s extends a<ShareAwemeContent> {
    Animation A = AnimationUtils.loadAnimation(this.itemView.getContext(), R.anim.c6);
    long B;
    private RemoteImageView C;
    private TextView D;
    private ImageView E;
    private TextView F;
    private ImageView G;
    private KeepSurfaceTextureView H;
    private TuxTextView I;
    private ImageView J;
    private ai K;
    private com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.b.a L;
    private b<Boolean, z> M = new t(this);

    /* renamed from: a  reason: collision with root package name */
    int f101460a = -1;

    /* renamed from: b  reason: collision with root package name */
    public TextView f101461b;
    ImageView x;
    public Aweme y;
    public ShareAwemeContent z;

    static {
        Covode.recordClassIndex(64880);
    }

    static class a implements TextureView.SurfaceTextureListener {
        static {
            Covode.recordClassIndex(64882);
        }

        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        }

        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            return false;
        }

        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        }

        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public final void bD_() {
        super.bD_();
        this.H.setSurfaceTextureListener(new a((byte) 0));
    }

    /* access modifiers changed from: protected */
    public String i() {
        return this.itemView.getContext().getString(R.string.h8q);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public void a() {
        Drawable background;
        super.a();
        this.C = (RemoteImageView) this.itemView.findViewById(R.id.ads);
        this.f101461b = (TextView) this.itemView.findViewById(R.id.aeb);
        this.o = a.C2518a.a(this.itemView.findViewById(R.id.ae6));
        this.D = (TextView) this.itemView.findViewById(R.id.ae9);
        this.E = (ImageView) this.itemView.findViewById(R.id.aec);
        this.F = (TextView) this.itemView.findViewById(R.id.aeg);
        this.G = (ImageView) this.itemView.findViewById(R.id.bzw);
        this.H = (KeepSurfaceTextureView) this.itemView.findViewById(R.id.fgj);
        this.x = (ImageView) this.itemView.findViewById(R.id.f2k);
        this.J = (ImageView) this.itemView.findViewById(R.id.d5i);
        this.L = new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.b.a(this.itemView);
        View findViewById = this.itemView.findViewById(R.id.a0b);
        if (!(findViewById == null || (background = findViewById.getBackground()) == null)) {
            int i2 = Build.VERSION.SDK_INT;
            background.setAutoMirrored(true);
        }
        this.I = (TuxTextView) this.itemView.findViewById(R.id.f88);
    }

    public final void a(boolean z2) {
        if (!z2) {
            this.M.invoke(false);
        }
    }

    public s(View view) {
        super(view);
        MethodCollector.i(6274);
        MethodCollector.o(6274);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public void a(View.OnClickListener onClickListener) {
        super.a(onClickListener);
        this.C.setOnClickListener(onClickListener);
        this.f101461b.setOnClickListener(onClickListener);
        this.o.a(new u(this, onClickListener));
        this.t.a(this.C, this.f101461b);
    }

    public void a(ai aiVar, ai aiVar2, final ShareAwemeContent shareAwemeContent, int i2) {
        TextView textView;
        super.a(aiVar, aiVar2, (BaseContent) shareAwemeContent, i2);
        int awemeType = shareAwemeContent.getAwemeType();
        this.z = shareAwemeContent;
        this.p = shareAwemeContent;
        this.f101460a = i2;
        this.K = aiVar;
        this.y = null;
        l.d(aiVar, "");
        l.d(shareAwemeContent, "");
        if (awemeType == 0 || awemeType == 23 || awemeType == 40) {
            ImageView imageView = this.E;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (awemeType == 23 && (textView = this.D) != null) {
                textView.setVisibility(0);
            }
        } else {
            ImageView imageView2 = this.E;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
        }
        if (!ShareStoryContent.isStory(shareAwemeContent) || !g.f137757a.a()) {
            this.I.setVisibility(8);
        } else if (((ShareStoryContent) shareAwemeContent).getSourceType().intValue() == 1) {
            this.I.setText(i());
            this.I.setVisibility(0);
        } else {
            this.I.setVisibility(8);
        }
        this.G.setVisibility(0);
        com.ss.android.ugc.aweme.im.sdk.chat.b.c.b.a(this.itemView, aiVar, shareAwemeContent, this.M);
        com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a.a(this.C, shareAwemeContent.getContentThumb());
        TextView textView2 = this.f101461b;
        l.d(aiVar, "");
        l.d(shareAwemeContent, "");
        String str = aiVar.getLocalExt().get("feed_ad_fake_nickname");
        if (str == null) {
            if (shareAwemeContent.getAuthorUsername() == null) {
                str = shareAwemeContent.getContentName();
            } else {
                str = shareAwemeContent.getAuthorUsername();
            }
        }
        textView2.setText(str);
        if (this.F != null) {
            String title = shareAwemeContent.getTitle();
            if (!TextUtils.isEmpty(title)) {
                this.F.setText(title);
                this.F.setVisibility(0);
            } else {
                this.F.setVisibility(8);
            }
        }
        if (awemeType == 40) {
            this.o.a(50331648, 48);
        } else {
            this.o.a(50331648, 2);
        }
        this.o.a(67108864, shareAwemeContent.getItemId());
        this.o.a(134217728, aiVar);
        this.C.setTag(50331648, 4);
        this.C.setTag(100663296, shareAwemeContent);
        this.f101461b.setTag(50331648, 4);
        this.f101461b.setTag(100663296, shareAwemeContent);
        this.u.a(String.valueOf(this.s.getSender()), this.s.getSecSender());
        this.J.setVisibility(8);
        if (this.z != null && !q.a()) {
            r.a("client_show", new d().a("enter_from", "chat").a("author_id", this.z.getUser()).a("group_id", this.z.getItemId()).a("content", "video").a("display", "card").a("is_auto_play", "0").f66730a);
        }
        this.H.setVisibility(8);
        if (TextUtils.isEmpty(shareAwemeContent.getItemId())) {
            com.ss.android.ugc.aweme.im.service.m.a.a("ShareAwemeReceiveAuto", "fetchPlayerData getItemId is emptytrue");
            a(true);
            return;
        }
        View view = this.itemView;
        ai aiVar3 = this.K;
        ShareAwemeContent shareAwemeContent2 = this.z;
        AnonymousClass1 r5 = new a.AbstractC2574a() {
            /* class com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.s.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ boolean f101462a = true;

            static {
                Covode.recordClassIndex(64881);
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.common.data.api.a.AbstractC2574a
            public final void a() {
                com.ss.android.ugc.aweme.im.service.m.a.a("ShareAwemeReceiveAuto", "query failed -1  isPreload " + "");
                s.this.a(this.f101462a);
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.common.data.api.a.AbstractC2574a
            public final void a(Object obj) {
                if (!(obj instanceof Aweme)) {
                    com.ss.android.ugc.aweme.im.service.m.a.a("ShareAwemeReceiveAuto", "queryNotAweme " + this.f101462a);
                    s.this.a(this.f101462a);
                    return;
                }
                s.this.y = (Aweme) obj;
                if (TextUtils.isEmpty(s.this.y.getAid()) || !TextUtils.equals(shareAwemeContent.getItemId(), s.this.y.getAid())) {
                    com.ss.android.ugc.aweme.im.service.m.a.a("ShareAwemeReceiveAuto", "aid not match " + this.f101462a);
                    s.this.a(this.f101462a);
                }
                if (!TextUtils.equals(shareAwemeContent.getItemId(), s.this.z.getItemId())) {
                    com.ss.android.ugc.aweme.im.service.m.a.a("ShareAwemeReceiveAuto", "[autoplay] error itemId not match, isPreload: " + this.f101462a);
                } else if (s.this.y.getAuthor() != null && s.this.y.getAuthor().isAdFake() && !TextUtils.equals(s.this.y.getAuthor().getNickname(), s.this.f101461b.toString())) {
                    shareAwemeContent.setAuthorUsername(s.this.y.getAuthor().getNickname());
                    s.this.f101461b.setText(s.this.y.getAuthor().getNickname());
                }
            }
        };
        l.d(view, "");
        l.d(aiVar3, "");
        l.d(shareAwemeContent2, "");
        l.d(r5, "");
        if (com.ss.android.ugc.aweme.im.sdk.chat.b.c.b.a(aiVar3)) {
            return;
        }
        if (!ShareStoryContent.Companion.isStory(shareAwemeContent2) || g.f137757a.a()) {
            bz unused = i.a(com.ss.android.ugc.aweme.im.sdk.chat.b.c.b.f100171d, bf.f159041b, null, new b.f(shareAwemeContent2, r5, view, aiVar3, null), 2);
        }
    }
}
