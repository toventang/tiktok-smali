package com.bytedance.android.livesdk.service.b;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.recyclerview.widget.j;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.dialogv2.b.d;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.a.a;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class b extends j.a {

    /* renamed from: a  reason: collision with root package name */
    private final List<com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b>> f21281a;

    /* renamed from: b  reason: collision with root package name */
    private final List<com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b>> f21282b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f21283c = false;

    static {
        Covode.recordClassIndex(12557);
    }

    @Override // androidx.recyclerview.widget.j.a
    public final int a() {
        return this.f21281a.size();
    }

    @Override // androidx.recyclerview.widget.j.a
    public final int b() {
        return this.f21282b.size();
    }

    public b(List<com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b>> list, List<com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b>> list2) {
        this.f21281a = list;
        this.f21282b = list2;
    }

    private static boolean a(ImageModel imageModel, ImageModel imageModel2) {
        if (imageModel == imageModel2) {
            return true;
        }
        if (imageModel == null || imageModel2 == null || !imageModel.getUri().equals(imageModel2.getUri())) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.j.a
    public final boolean b(int i2, int i3) {
        if (this.f21281a.get(i2).d() == this.f21282b.get(i3).d()) {
            return true;
        }
        return false;
    }

    private static boolean a(com.bytedance.android.livesdk.gift.model.a.b bVar, com.bytedance.android.livesdk.gift.model.a.b bVar2) {
        if (!TextUtils.equals(bVar.a(), bVar2.a()) || !TextUtils.equals(bVar.b(), bVar2.b()) || !a(bVar.c(), bVar2.c()) || !a(bVar.f(), bVar2.f())) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.j.a
    public final Object a(int i2, int i3) {
        com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar = this.f21281a.get(i2);
        com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar2 = this.f21282b.get(i3);
        if (!a(bVar, bVar2)) {
            return super.a(i2, i3);
        }
        if (!(bVar instanceof d) || !(bVar2 instanceof d)) {
            return super.a(i2, i3);
        }
        Bundle bundle = new Bundle();
        if (((Prop) bVar.f17864b).count != ((Prop) bVar2.f17864b).count) {
            bundle.putString("key_prop_count", String.valueOf(((Prop) bVar2.f17864b).count));
            bundle.putBoolean("key_prop_show_item_combo", this.f21283c);
        }
        return bundle;
    }

    @Override // androidx.recyclerview.widget.j.a
    public final boolean c(int i2, int i3) {
        com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar = this.f21281a.get(i2);
        com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar2 = this.f21282b.get(i3);
        if (!(bVar instanceof d) || !(bVar2 instanceof d)) {
            if ((bVar instanceof a) && (bVar2 instanceof a) && ((a) bVar).e() != ((a) bVar2).e()) {
                return false;
            }
        } else if (((Prop) bVar.f17864b).count != ((Prop) bVar2.f17864b).count) {
            return false;
        }
        return a(bVar, bVar2);
    }
}
