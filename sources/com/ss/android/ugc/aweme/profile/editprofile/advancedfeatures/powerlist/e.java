package com.ss.android.ugc.aweme.profile.editprofile.advancedfeatures.powerlist;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.b.a;
import com.ss.android.ugc.aweme.profile.editprofile.vm.ProfileEditProfileViewModel;
import f.a.b.b;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class e extends n.a {

    /* renamed from: a  reason: collision with root package name */
    private final com.bytedance.ies.powerlist.e f116167a;

    /* renamed from: b  reason: collision with root package name */
    private final ProfileEditProfileViewModel f116168b;

    static {
        Covode.recordClassIndex(74933);
    }

    @Override // androidx.recyclerview.widget.n.a
    public final void a(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
    }

    @Override // androidx.recyclerview.widget.n.a
    public final boolean b() {
        return false;
    }

    public e(com.bytedance.ies.powerlist.e eVar, ProfileEditProfileViewModel profileEditProfileViewModel) {
        l.d(eVar, "");
        l.d(profileEditProfileViewModel, "");
        this.f116167a = eVar;
        this.f116168b = profileEditProfileViewModel;
    }

    @Override // androidx.recyclerview.widget.n.a
    public final int a(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        l.d(recyclerView, "");
        l.d(viewHolder, "");
        if (!(viewHolder instanceof b) || !((b) viewHolder).a()) {
            return 0;
        }
        return n.a.b(3, 0);
    }

    @Override // androidx.recyclerview.widget.n.a
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        if (i2 != 0 && (viewHolder instanceof b)) {
            b bVar = (b) viewHolder;
            if (bVar.a()) {
                bVar.b();
                this.f116168b.a(this.f116167a);
            }
        }
        super.a(viewHolder, i2);
    }

    @Override // androidx.recyclerview.widget.n.a
    public final void d(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        l.d(recyclerView, "");
        l.d(viewHolder, "");
        super.d(recyclerView, viewHolder);
        if (viewHolder instanceof b) {
            ((b) viewHolder).c();
            ProfileEditProfileViewModel profileEditProfileViewModel = this.f116168b;
            com.bytedance.ies.powerlist.e eVar = this.f116167a;
            l.d(eVar, "");
            profileEditProfileViewModel.f116252b.clear();
            List<Integer> list = profileEditProfileViewModel.f116252b;
            List<a> c2 = eVar.b().c();
            ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) c2, 10));
            for (T t : c2) {
                Objects.requireNonNull(t, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.editprofile.advancedfeatures.powerlist.ProfileAdvancedFeaturesItem");
                arrayList.add(Integer.valueOf(t.f116166a));
            }
            list.addAll(h.a.n.g((Collection) arrayList));
            ProfileEditProfileViewModel profileEditProfileViewModel2 = this.f116168b;
            if (!l.a(profileEditProfileViewModel2.f116251a, profileEditProfileViewModel2.f116252b)) {
                b a2 = profileEditProfileViewModel2.a().f116155a.a(ProfileEditProfileViewModel.a(profileEditProfileViewModel2.f116252b)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new ProfileEditProfileViewModel.e(profileEditProfileViewModel2), new ProfileEditProfileViewModel.f(profileEditProfileViewModel2));
                l.b(a2, "");
                f.a.j.a.a(a2, profileEditProfileViewModel2.f116258h);
                profileEditProfileViewModel2.f116257g.setValue(true);
            }
        }
    }

    @Override // androidx.recyclerview.widget.n.a
    public final boolean b(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        l.d(recyclerView, "");
        l.d(viewHolder, "");
        l.d(viewHolder2, "");
        int adapterPosition = viewHolder.getAdapterPosition();
        int adapterPosition2 = viewHolder2.getAdapterPosition();
        if (adapterPosition2 <= 0 || adapterPosition <= 0) {
            return false;
        }
        if (!(recyclerView instanceof PowerList)) {
            return true;
        }
        com.bytedance.ies.powerlist.e eVar = this.f116167a;
        l.d(eVar, "");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(eVar.b().c());
        Collections.swap(arrayList, adapterPosition - 1, adapterPosition2 - 1);
        eVar.b().c(arrayList);
        RecyclerView.a adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return true;
        }
        adapter.notifyItemMoved(adapterPosition, adapterPosition2);
        return true;
    }
}
