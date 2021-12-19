package com.ss.android.ugc.aweme.emoji.i.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.core.content.b;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.g.c;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.a.n;
import h.f.b.l;
import h.p;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class a implements com.ss.android.ugc.aweme.emoji.i.a {

    /* renamed from: a  reason: collision with root package name */
    private final c f89331a;

    /* renamed from: b  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.emoji.i.a.a.a f89332b;

    static {
        Covode.recordClassIndex(56132);
    }

    @Override // com.ss.android.ugc.aweme.emoji.i.a
    public final String b() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.emoji.i.a
    public final int a() {
        return com.ss.android.ugc.aweme.emoji.i.a.a.a.f89334b.size();
    }

    @Override // com.ss.android.ugc.aweme.emoji.i.a
    public final Drawable a(Context context) {
        if (context != null) {
            return b.a(context, 2131231996);
        }
        return null;
    }

    public a(com.ss.android.ugc.aweme.emoji.i.a.a.a aVar) {
        c cVar;
        l.d(aVar, "");
        this.f89332b = aVar;
        IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
        if (createIIMServicebyMonsterPlugin != null) {
            cVar = createIIMServicebyMonsterPlugin.getDurationPerfMon();
        } else {
            cVar = null;
        }
        this.f89331a = cVar;
    }

    @Override // com.ss.android.ugc.aweme.emoji.i.a
    public final boolean a(String str) {
        if (str == null || this.f89332b.a(str).length() <= 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.emoji.i.a
    public final void a(RemoteImageView remoteImageView, com.ss.android.ugc.aweme.emoji.b.a aVar) {
        if (remoteImageView != null && aVar != null) {
            String str = aVar.f89104b;
            if (str == null || str.length() == 0) {
                remoteImageView.setActualImageResource(R.drawable.aep);
            } else {
                remoteImageView.setImageURI(aVar.f89104b);
            }
            Drawable drawable = remoteImageView.getDrawable();
            if (drawable != null) {
                drawable.setAutoMirrored(true);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.emoji.i.a
    public final Drawable a(Context context, String str) {
        Bitmap decodeBitmap;
        BitmapDrawable bitmapDrawable = null;
        if (context != null) {
            boolean z = false;
            if (!(str == null || str.length() == 0)) {
                c cVar = this.f89331a;
                if (cVar != null) {
                    boolean unused = cVar.a(new com.ss.android.ugc.aweme.emoji.i.a.b.b(str), false);
                }
                com.ss.android.ugc.aweme.emoji.i.a.a.a aVar = this.f89332b;
                l.d(str, "");
                if (aVar.a().get(str) == null) {
                    File file = new File(aVar.a(str));
                    if (file.exists() && (decodeBitmap = BitmapUtils.decodeBitmap(file, ((Number) com.ss.android.ugc.aweme.emoji.i.a.a.a.f89333a.getValue()).intValue())) != null) {
                        aVar.a().put(str, decodeBitmap);
                    }
                }
                Bitmap bitmap = aVar.a().get(str);
                if (bitmap != null) {
                    bitmapDrawable = new BitmapDrawable(context.getResources(), bitmap);
                }
                c cVar2 = this.f89331a;
                if (cVar2 != null) {
                    com.ss.android.ugc.aweme.emoji.i.a.b.b bVar = new com.ss.android.ugc.aweme.emoji.i.a.b.b(str);
                    if (bitmapDrawable != null) {
                        z = true;
                    }
                    cVar2.a(bVar, new com.ss.android.ugc.aweme.emoji.i.a.b.a(z));
                }
            }
        }
        return bitmapDrawable;
    }

    @Override // com.ss.android.ugc.aweme.emoji.i.a
    public final List<com.ss.android.ugc.aweme.emoji.b.a> a(int i2, int i3) {
        int i4;
        if (i2 < 0 || (i4 = i3 + i2) > com.ss.android.ugc.aweme.emoji.i.a.a.a.f89334b.size()) {
            return new ArrayList();
        }
        List<p> subList = ag.e(com.ss.android.ugc.aweme.emoji.i.a.a.a.f89334b).subList(i2, i4);
        ArrayList arrayList = new ArrayList(n.a((Iterable) subList, 10));
        for (p pVar : subList) {
            String str = (String) pVar.getFirst();
            com.ss.android.ugc.aweme.emoji.b.a aVar = new com.ss.android.ugc.aweme.emoji.b.a();
            aVar.f89105c = str;
            aVar.f89104b = this.f89332b.a(str);
            arrayList.add(aVar);
        }
        return n.g((Collection) arrayList);
    }
}
