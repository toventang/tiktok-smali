package com.ss.android.ugc.aweme.tools.draft;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.app.d;
import androidx.core.h.v;
import androidx.fragment.app.e;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.tools.draft.DraftItemView;
import com.ss.android.ugc.tools.view.e.b;
import com.zhiliaoapp.musically.R;
import java.util.Map;

public class AwemeDraftViewHolder extends com.ss.android.ugc.aweme.tools.draft.a.a<c> implements WeakHandler.IHandler, au {

    /* renamed from: a  reason: collision with root package name */
    ExpandableMentionTextView f139313a;

    /* renamed from: b  reason: collision with root package name */
    ViewGroup f139314b;

    /* renamed from: c  reason: collision with root package name */
    TextView f139315c;

    /* renamed from: d  reason: collision with root package name */
    TextView f139316d;

    /* renamed from: e  reason: collision with root package name */
    ImageView f139317e;

    /* renamed from: f  reason: collision with root package name */
    public SimpleDraweeView f139318f;

    /* renamed from: g  reason: collision with root package name */
    View f139319g;

    /* renamed from: h  reason: collision with root package name */
    ImageView f139320h;

    /* renamed from: i  reason: collision with root package name */
    AppCompatCheckBox f139321i;

    /* renamed from: j  reason: collision with root package name */
    DraftItemView f139322j;

    /* renamed from: k  reason: collision with root package name */
    Space f139323k;

    /* renamed from: l  reason: collision with root package name */
    RelativeLayout f139324l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f139325m;
    public boolean n;
    a o;
    Context p;
    long q;
    Map<ImageView, com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> r;
    public boolean s;
    private Space w;
    private b x;

    public interface a {
        static {
            Covode.recordClassIndex(91081);
        }

        void a(int i2, c cVar);

        void a(View view, c cVar);
    }

    static {
        Covode.recordClassIndex(91078);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        Context context = this.p;
        Intent intent = (Intent) message.obj;
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
        b bVar = this.x;
        if (bVar != null && bVar.isShowing()) {
            this.x.dismiss();
            this.x = null;
        }
    }

    public static boolean a(ImageView imageView, Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return false;
        }
        imageView.setImageBitmap(bitmap);
        return true;
    }

    AwemeDraftViewHolder(View view, Map<ImageView, com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> map, a aVar) {
        super(view);
        this.f139313a = (ExpandableMentionTextView) v.c(view, (int) R.id.q2);
        this.f139314b = (ViewGroup) v.c(view, (int) R.id.cgw);
        this.f139315c = (TextView) v.c(view, (int) R.id.eyt);
        this.f139316d = (TextView) v.c(view, (int) R.id.pt);
        this.f139317e = (ImageView) v.c(view, (int) R.id.a46);
        this.f139318f = (SimpleDraweeView) v.c(view, (int) R.id.agf);
        this.f139319g = v.c(view, (int) R.id.exg);
        this.f139320h = (ImageView) v.c(view, (int) R.id.apk);
        this.f139321i = (AppCompatCheckBox) v.c(view, (int) R.id.a5_);
        DraftItemView draftItemView = (DraftItemView) v.c(view, (int) R.id.ces);
        this.f139322j = draftItemView;
        draftItemView.setOnScrollListener(new DraftItemView.a() {
            /* class com.ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder.AnonymousClass1 */

            static {
                Covode.recordClassIndex(91079);
            }

            @Override // com.ss.android.ugc.aweme.tools.draft.DraftItemView.a
            public final void a(int i2, boolean z) {
                int i3;
                int i4;
                AwemeDraftViewHolder awemeDraftViewHolder = AwemeDraftViewHolder.this;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) awemeDraftViewHolder.f139314b.getLayoutParams();
                int i5 = 1;
                if (com.ss.android.ugc.aweme.tools.c.a(awemeDraftViewHolder.f139313a.getContext())) {
                    int i6 = marginLayoutParams.leftMargin;
                    if (z) {
                        i5 = -1;
                    }
                    i3 = i6 + (i2 * i5);
                    i4 = marginLayoutParams.rightMargin;
                } else {
                    i3 = marginLayoutParams.leftMargin;
                    int i7 = marginLayoutParams.rightMargin;
                    if (!z) {
                        i5 = -1;
                    }
                    i4 = (i2 * i5) + i7;
                }
                marginLayoutParams.leftMargin = i3;
                marginLayoutParams.rightMargin = i4;
                awemeDraftViewHolder.f139314b.setLayoutParams(marginLayoutParams);
            }
        });
        this.f139323k = (Space) v.c(view, (int) R.id.apj);
        this.w = (Space) v.c(view, (int) R.id.api);
        RelativeLayout relativeLayout = (RelativeLayout) v.c(view, (int) R.id.apf);
        this.f139324l = relativeLayout;
        relativeLayout.setOnClickListener(new u(this));
        this.f139324l.setOnLongClickListener(new v(this));
        this.o = aVar;
        Context context = view.getContext();
        this.p = context;
        Activity a2 = com.ss.android.ugc.aweme.utils.i.a(context);
        if (a2 instanceof e) {
            ((d) a2).getLifecycle().a(this);
        }
        this.r = map;
    }
}
