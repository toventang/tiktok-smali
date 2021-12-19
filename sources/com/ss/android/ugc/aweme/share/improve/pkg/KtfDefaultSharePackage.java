package com.ss.android.ugc.aweme.share.improve.pkg;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.KtfInfo;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;

public abstract class KtfDefaultSharePackage extends SharePackage {
    static {
        Covode.recordClassIndex(81382);
    }

    public abstract Aweme b();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtfDefaultSharePackage(SharePackage.a aVar) {
        super(aVar);
        l.d(aVar, "");
    }

    /* access modifiers changed from: package-private */
    public static final class a implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f123949a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ KtfInfo f123950b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Aweme f123951c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f123952d;

        static {
            Covode.recordClassIndex(81383);
        }

        a(Context context, KtfInfo ktfInfo, Aweme aweme, h.f.a.a aVar) {
            this.f123949a = context;
            this.f123950b = ktfInfo;
            this.f123951c = aweme;
            this.f123952d = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            r.a("tns_share_warning_cancel_ktf", new d().a("object_id", this.f123951c.getAid()).f66730a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f123953a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ KtfInfo f123954b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Aweme f123955c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f123956d;

        static {
            Covode.recordClassIndex(81384);
        }

        b(Context context, KtfInfo ktfInfo, Aweme aweme, h.f.a.a aVar) {
            this.f123953a = context;
            this.f123954b = ktfInfo;
            this.f123955c = aweme;
            this.f123956d = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            r.a("tns_share_warning_stillshare_ktf", new d().a("object_id", this.f123955c.getAid()).f66730a);
            h.f.a.a aVar = this.f123956d;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.SharePackage
    public void a(Context context, com.ss.android.ugc.aweme.sharer.b bVar, h.f.a.a<z> aVar) {
        String str;
        String str2;
        l.d(context, "");
        Aweme b2 = b();
        if (b2 != null) {
            if (bVar != null) {
                str = bVar.a();
            } else {
                str = null;
            }
            if (!TextUtils.equals("download", str)) {
                KtfInfo ktfInfo = b2.getUploadMiscInfoStruct().ktfInfo;
                if (ktfInfo != null && ktfInfo.getShowMessageOnShare() && !ktfInfo.getHasShowOnce()) {
                    ktfInfo.setHasShowOnce(true);
                    a.C0731a aVar2 = new a.C0731a(context);
                    ImageView imageView = new ImageView(context);
                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    imageView.setImageResource(R.raw.icon_exclamation_mark_triangle_fill);
                    aVar2.a(imageView, 48, 48);
                    aVar2.E = true;
                    aVar2.F = true;
                    aVar2.M = false;
                    aVar2.a(R.string.cuc);
                    aVar2.f33403c = ktfInfo.getMessageTextOnShare();
                    aVar2.a(R.string.cub, (DialogInterface.OnClickListener) new a(context, ktfInfo, b2, aVar), false);
                    aVar2.b(R.string.cud, (DialogInterface.OnClickListener) new b(context, ktfInfo, b2, aVar), false);
                    aVar2.a().c();
                    if (bVar == null || TextUtils.equals(bVar.a(), "chat_merge")) {
                        str2 = "send_to";
                    } else {
                        str2 = "share_to";
                    }
                    r.a("tns_share_warning_popout_ktf", new d().a("object_id", b2.getAid()).a(StringSet.type, str2).f66730a);
                } else if (aVar != null) {
                    aVar.invoke();
                }
            } else if (aVar != null) {
                aVar.invoke();
            }
        } else if (aVar != null) {
            aVar.invoke();
        }
    }
}
