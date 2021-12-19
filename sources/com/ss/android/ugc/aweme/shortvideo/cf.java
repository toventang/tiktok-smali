package com.ss.android.ugc.aweme.shortvideo;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.property.da;
import com.ss.android.ugc.aweme.shortvideo.cs;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.PermissionSettingItem;
import com.ss.android.ugc.aweme.shortvideo.ui.j;
import com.zhiliaoapp.musically.R;
import h.f.a.a;
import h.z;
import java.util.List;

public final class cf {

    /* renamed from: a  reason: collision with root package name */
    public Fragment f125109a;

    /* renamed from: b  reason: collision with root package name */
    public PermissionSettingItem f125110b;

    /* renamed from: c  reason: collision with root package name */
    int f125111c;

    /* renamed from: d  reason: collision with root package name */
    public a<z> f125112d;

    /* renamed from: e  reason: collision with root package name */
    public cs.b f125113e;

    /* renamed from: f  reason: collision with root package name */
    public ce f125114f;

    /* renamed from: g  reason: collision with root package name */
    public j f125115g;

    /* renamed from: h  reason: collision with root package name */
    public VideoPublishEditModel f125116h;

    static {
        Covode.recordClassIndex(82181);
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.putInt("permission", da.a() ? 1 : 0);
        }
    }

    public cf(Fragment fragment, PermissionSettingItem permissionSettingItem, int i2) {
        this.f125109a = fragment;
        this.f125110b = permissionSettingItem;
        this.f125111c = i2;
    }

    public final void a(ce ceVar, j jVar, boolean z, boolean z2) {
        this.f125113e.f125308a = this.f125111c;
        VideoPublishEditModel videoPublishEditModel = this.f125116h;
        if (videoPublishEditModel != null) {
            this.f125113e.f125309b = videoPublishEditModel.mStickerID;
        }
        this.f125113e.f125310c = this.f125110b.getPermission();
        this.f125113e.f125311d = this.f125110b.f131122a;
        this.f125113e.f125312e = this.f125110b.getPreventSelfSeeReason();
        this.f125113e.f125313f = R.string.byi;
        this.f125113e.f125314g = R.string.byh;
        this.f125113e.f125315h = ceVar.a();
        this.f125113e.f125316i = ceVar.b();
        this.f125113e.f125317j = ceVar.c();
        this.f125113e.f125318k = ceVar.d();
        this.f125113e.f125319l = ceVar.e();
        this.f125113e.f125320m = this.f125110b.f131123b;
        this.f125113e.n = this.f125110b.getMissionStatus();
        this.f125113e.o = this.f125110b.getMissionId();
        this.f125113e.p = jVar;
        this.f125113e.q = this.f125116h;
        this.f125113e.r = this.f125112d;
        this.f125113e.s = z;
        this.f125113e.t = z2;
    }

    public final void a(int i2, List<User> list, int i3, boolean z, String str) {
        this.f125110b.a(i2, list, i3, z, str);
    }

    public final void a(ce ceVar, j jVar, DialogInterface.OnDismissListener onDismissListener, boolean z, boolean z2) {
        this.f125113e = new cs.b();
        this.f125114f = ceVar;
        this.f125115g = jVar;
        this.f125110b.a(new cg(this, ceVar, jVar, z, z2, onDismissListener));
        if (!da.a()) {
            this.f125110b.setVisibility(8);
        }
    }
}
