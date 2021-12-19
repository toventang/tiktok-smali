package com.ss.android.ugc.aweme.external;

import androidx.fragment.app.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.external.IDonationService;
import com.ss.android.ugc.gamora.editor.sticker.donation.c.b;
import com.ss.android.ugc.gamora.editor.sticker.donation.c.c;
import com.ss.android.ugc.gamora.editor.sticker.donation.i;
import h.f.b.l;

public final class f implements IDonationService {
    static {
        Covode.recordClassIndex(56744);
    }

    public static final class a implements i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IDonationService.OnDonationOrgChangeListener f90393a;

        static {
            Covode.recordClassIndex(56745);
        }

        @Override // com.ss.android.ugc.gamora.editor.sticker.donation.i
        public final void a() {
            this.f90393a.onDismiss();
        }

        @Override // com.ss.android.ugc.gamora.editor.sticker.donation.i
        public final void b() {
            this.f90393a.onShow();
        }

        a(IDonationService.OnDonationOrgChangeListener onDonationOrgChangeListener) {
            this.f90393a = onDonationOrgChangeListener;
        }

        @Override // com.ss.android.ugc.gamora.editor.sticker.donation.i
        public final void a(b bVar) {
            l.d(bVar, "");
            IDonationService.OrganizationModel organizationModel = new IDonationService.OrganizationModel(bVar.getName(), bVar.getDesc(), bVar.getIcon(), bVar.getDetailUrl(), bVar.getDonateLink(), bVar.getNgoId());
            if (bVar instanceof c) {
                organizationModel.setAddTime(bVar.getAddTime());
            }
            this.f90393a.onOrgSelected(organizationModel);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.IDonationService
    public final d getSelectDonationDialog(IDonationService.OnDonationOrgChangeListener onDonationOrgChangeListener) {
        l.d(onDonationOrgChangeListener, "");
        com.ss.android.ugc.gamora.editor.sticker.donation.f fVar = new com.ss.android.ugc.gamora.editor.sticker.donation.f();
        fVar.f146571a = new a(onDonationOrgChangeListener);
        return fVar;
    }
}
