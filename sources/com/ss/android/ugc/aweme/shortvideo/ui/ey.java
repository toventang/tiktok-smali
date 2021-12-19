package com.ss.android.ugc.aweme.shortvideo.ui;

import androidx.lifecycle.u;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.photo.a.a;
import com.ss.android.ugc.aweme.services.IAVMixFeedServiceImpl;
import com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo;
import com.ss.android.ugc.aweme.services.publish.IPermissionAction;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ey implements u {

    /* renamed from: a  reason: collision with root package name */
    private final cj f131738a;

    /* renamed from: b  reason: collision with root package name */
    private final ExtensionDataRepo f131739b;

    static {
        Covode.recordClassIndex(86281);
    }

    ey(cj cjVar, ExtensionDataRepo extensionDataRepo) {
        this.f131738a = cjVar;
        this.f131739b = extensionDataRepo;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        cj cjVar = this.f131738a;
        ExtensionDataRepo extensionDataRepo = this.f131739b;
        a aVar = (a) obj;
        if (aVar != null) {
            int permission = aVar.getPermission();
            if (extensionDataRepo.getUpdateAnchor().getValue() != null) {
                extensionDataRepo.setIPermissionAction(new IPermissionAction(permission, extensionDataRepo, aVar) {
                    /* class com.ss.android.ugc.aweme.shortvideo.ui.cj.AnonymousClass9 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ int f131633a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ ExtensionDataRepo f131634b;

                    /* renamed from: c  reason: collision with root package name */
                    final /* synthetic */ com.ss.android.ugc.aweme.photo.a.a f131635c;

                    static {
                        Covode.recordClassIndex(86201);
                    }

                    @Override // com.ss.android.ugc.aweme.services.publish.IPermissionAction
                    public final void cancel() {
                        cj.this.f131606m.setValue(new com.ss.android.ugc.aweme.photo.a.a(cj.this.n.f125110b.getPermission(), this.f131635c.getExcludeUserList(), cj.this.n.f125110b.getAllowRecommend()));
                    }

                    @Override // com.ss.android.ugc.aweme.services.publish.IPermissionAction
                    public final void confirm() {
                        if (this.f131633a != 1) {
                            this.f131634b.getI18nPrivacy().setValue(true);
                        } else {
                            this.f131634b.getI18nPrivacy().setValue(false);
                            this.f131634b.getUpdateAnchor().setValue(null);
                        }
                        cj.this.n.a(this.f131633a, this.f131635c.getExcludeUserList(), 0, cj.this.Y, "");
                    }

                    {
                        this.f131633a = r2;
                        this.f131634b = r3;
                        this.f131635c = r4;
                    }
                });
                if (extensionDataRepo.getShowPermissionAction() != null && !extensionDataRepo.getShowPermissionAction().invoke(Integer.valueOf(permission)).booleanValue()) {
                    if (permission != 1) {
                        extensionDataRepo.getI18nPrivacy().setValue(true);
                    } else {
                        extensionDataRepo.getI18nPrivacy().setValue(false);
                    }
                    cjVar.n.a(permission, aVar.getExcludeUserList(), 0, cjVar.Y, "");
                }
            } else {
                if (permission != 1) {
                    extensionDataRepo.getI18nPrivacy().setValue(true);
                } else {
                    extensionDataRepo.getI18nPrivacy().setValue(false);
                }
                cjVar.n.a(permission, aVar.getExcludeUserList(), aVar.getAllowRecommend(), cjVar.Y, "");
            }
            if (cjVar.f131602i != null) {
                aVar.getExcludeUserList();
            }
            if (IAVMixFeedServiceImpl.createIAVMixFeedServicebyMonsterPlugin(false).needShowAddOrRemoveButton()) {
                if (permission != 0) {
                    cjVar.f131598e._alpha.setValue(Float.valueOf(0.3f));
                    cjVar.f131603j = false;
                    cjVar.f131605l = "";
                    cjVar.f131604k = "";
                    cjVar.f131598e._nameText.setValue("");
                } else {
                    cjVar.f131598e._alpha.setValue(Float.valueOf(1.0f));
                    cjVar.f131603j = true;
                }
            }
            if (!b.a((Collection) cjVar.K.tagUserList)) {
                ArrayList arrayList = new ArrayList();
                if (permission == 1) {
                    Iterator<InteractionTagUserInfo> it = cjVar.K.tagUserList.iterator();
                    while (it.hasNext()) {
                        InteractionTagUserInfo next = it.next();
                        arrayList.add(cjVar.af ? next.getNickname() : next.getUniqueId());
                    }
                    cjVar.K.tagUserList.clear();
                } else if (permission == 2) {
                    Iterator<InteractionTagUserInfo> it2 = cjVar.K.tagUserList.iterator();
                    while (it2.hasNext()) {
                        InteractionTagUserInfo next2 = it2.next();
                        if (next2.getFollowStatus() != 2) {
                            arrayList.add(cjVar.af ? next2.getNickname() : next2.getUniqueId());
                            it2.remove();
                        }
                    }
                }
                if (!b.a((Collection) arrayList) && arrayList.toString().length() >= 2) {
                    String obj2 = arrayList.toString();
                    new com.bytedance.tux.g.b(cjVar).a(com.a.a(cjVar.getString(R.string.gcd), new Object[]{obj2.substring(1, obj2.length() - 1)})).b();
                }
                cjVar.g();
            }
        }
    }
}
