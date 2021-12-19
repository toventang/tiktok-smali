package com.ss.android.ugc.aweme.share.improve.a;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.o.g;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.a.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public final class av implements h {

    /* renamed from: a  reason: collision with root package name */
    private final Aweme f123653a;

    /* renamed from: b  reason: collision with root package name */
    private final String f123654b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f123655c;

    static {
        Covode.recordClassIndex(81170);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        return R.string.fex;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "reuse_sticker";
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        return R.raw.icon_2pt_mask;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean d() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean e() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean f() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int g() {
        return R.raw.icon_effect;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context) {
        l.d(context, "");
        l.d(context, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(ImageView imageView) {
        l.d(imageView, "");
        l.d(imageView, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(TextView textView) {
        l.d(textView, "");
        h.a.a(this, textView);
    }

    private av(Aweme aweme, String str) {
        l.d(aweme, "");
        l.d(str, "");
        this.f123653a = aweme;
        this.f123654b = str;
        this.f123655c = false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        Collection collection;
        l.d(context, "");
        l.d(sharePackage, "");
        if (MSAdaptionService.c().b(context)) {
            g.a(context);
            return;
        }
        FaceStickerBean.sCurPropSource = "prop_reuse";
        if (!this.f123655c) {
            r.a("prop_reuse_icon", new d().a("prop_id", this.f123653a.getStickerIDs()).a("action_type", "click").a("group_id", this.f123653a.getAid()).f66730a);
        }
        ArrayList<String> arrayList = new ArrayList<>();
        if (!TextUtils.isEmpty(this.f123653a.getStickerIDs())) {
            String stickerIDs = this.f123653a.getStickerIDs();
            l.b(stickerIDs, "");
            List<String> split = new h.m.l(",").split(stickerIDs, 0);
            if (!split.isEmpty()) {
                ListIterator<String> listIterator = split.listIterator(split.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (listIterator.previous().length() != 0) {
                            collection = n.d((Iterable) split, listIterator.nextIndex() + 1);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            collection = z.INSTANCE;
            Object[] array = collection.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            String[] strArr = (String[]) array;
            for (String str : strArr) {
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
        }
        boolean downloadEffectOrMusicAfterEnterCamera = AVExternalServiceImpl.a().configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera();
        ShareDependService a2 = ShareDependService.a.a();
        Aweme aweme = this.f123653a;
        boolean z = this.f123655c;
        Video video = aweme.getVideo();
        l.b(video, "");
        a2.a(context, aweme, z, arrayList, "prop_reuse", video.getVideoLength(), downloadEffectOrMusicAfterEnterCamera);
    }

    public /* synthetic */ av(Aweme aweme, String str, byte b2) {
        this(aweme, str);
    }
}
