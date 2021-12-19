package com.ss.android.ugc.aweme.ecommerce.delivery.vm;

import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.delivery.b.a;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d;
import h.a.z;
import h.f.b.g;
import h.f.b.l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class DeliveryPanelState implements af {
    private final List<Object> addressRenderData;
    private final boolean apply;
    private final b changePage;
    private final Set<LogisticDTO> exposedItems;
    private final List<Object> logisticList;
    private final LogisticDTO selectedLogistic;
    private final a selectedShipToInfo;
    private final int status;

    static {
        Covode.recordClassIndex(53800);
    }

    public DeliveryPanelState() {
        this(null, false, null, null, null, 0, null, null, 255, null);
    }

    public static int com_ss_android_ugc_aweme_ecommerce_delivery_vm_DeliveryPanelState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeliveryPanelState copy$default(DeliveryPanelState deliveryPanelState, b bVar, boolean z, LogisticDTO logisticDTO, a aVar, List list, int i2, List list2, Set set, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            bVar = deliveryPanelState.changePage;
        }
        if ((i3 & 2) != 0) {
            z = deliveryPanelState.apply;
        }
        if ((i3 & 4) != 0) {
            logisticDTO = deliveryPanelState.selectedLogistic;
        }
        if ((i3 & 8) != 0) {
            aVar = deliveryPanelState.selectedShipToInfo;
        }
        if ((i3 & 16) != 0) {
            list = deliveryPanelState.addressRenderData;
        }
        if ((i3 & 32) != 0) {
            i2 = deliveryPanelState.status;
        }
        if ((i3 & 64) != 0) {
            list2 = deliveryPanelState.logisticList;
        }
        if ((i3 & 128) != 0) {
            set = deliveryPanelState.exposedItems;
        }
        return deliveryPanelState.copy(bVar, z, logisticDTO, aVar, list, i2, list2, set);
    }

    public final b component1() {
        return this.changePage;
    }

    public final boolean component2() {
        return this.apply;
    }

    public final LogisticDTO component3() {
        return this.selectedLogistic;
    }

    public final a component4() {
        return this.selectedShipToInfo;
    }

    public final List<Object> component5() {
        return this.addressRenderData;
    }

    public final int component6() {
        return this.status;
    }

    public final List<Object> component7() {
        return this.logisticList;
    }

    public final Set<LogisticDTO> component8() {
        return this.exposedItems;
    }

    public final DeliveryPanelState copy(b bVar, boolean z, LogisticDTO logisticDTO, a aVar, List<? extends Object> list, int i2, List<? extends Object> list2, Set<LogisticDTO> set) {
        l.d(bVar, "");
        l.d(aVar, "");
        l.d(list, "");
        l.d(set, "");
        return new DeliveryPanelState(bVar, z, logisticDTO, aVar, list, i2, list2, set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryPanelState)) {
            return false;
        }
        DeliveryPanelState deliveryPanelState = (DeliveryPanelState) obj;
        return l.a(this.changePage, deliveryPanelState.changePage) && this.apply == deliveryPanelState.apply && l.a(this.selectedLogistic, deliveryPanelState.selectedLogistic) && l.a(this.selectedShipToInfo, deliveryPanelState.selectedShipToInfo) && l.a(this.addressRenderData, deliveryPanelState.addressRenderData) && this.status == deliveryPanelState.status && l.a(this.logisticList, deliveryPanelState.logisticList) && l.a(this.exposedItems, deliveryPanelState.exposedItems);
    }

    public final int hashCode() {
        b bVar = this.changePage;
        int i2 = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        boolean z = this.apply;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        LogisticDTO logisticDTO = this.selectedLogistic;
        int hashCode2 = (i6 + (logisticDTO != null ? logisticDTO.hashCode() : 0)) * 31;
        a aVar = this.selectedShipToInfo;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        List<Object> list = this.addressRenderData;
        int hashCode4 = (((hashCode3 + (list != null ? list.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_ecommerce_delivery_vm_DeliveryPanelState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.status)) * 31;
        List<Object> list2 = this.logisticList;
        int hashCode5 = (hashCode4 + (list2 != null ? list2.hashCode() : 0)) * 31;
        Set<LogisticDTO> set = this.exposedItems;
        if (set != null) {
            i2 = set.hashCode();
        }
        return hashCode5 + i2;
    }

    public final String toString() {
        return "DeliveryPanelState(changePage=" + this.changePage + ", apply=" + this.apply + ", selectedLogistic=" + this.selectedLogistic + ", selectedShipToInfo=" + this.selectedShipToInfo + ", addressRenderData=" + this.addressRenderData + ", status=" + this.status + ", logisticList=" + this.logisticList + ", exposedItems=" + this.exposedItems + ")";
    }

    public final List<Object> getAddressRenderData() {
        return this.addressRenderData;
    }

    public final boolean getApply() {
        return this.apply;
    }

    public final b getChangePage() {
        return this.changePage;
    }

    public final Set<LogisticDTO> getExposedItems() {
        return this.exposedItems;
    }

    public final List<Object> getLogisticList() {
        return this.logisticList;
    }

    public final LogisticDTO getSelectedLogistic() {
        return this.selectedLogistic;
    }

    public final a getSelectedShipToInfo() {
        return this.selectedShipToInfo;
    }

    public final int getStatus() {
        return this.status;
    }

    public final boolean canSelectLogistic(Parcelable parcelable) {
        boolean z;
        boolean z2;
        d a2;
        boolean z3;
        if (this.selectedShipToInfo.f85830a == null) {
            z = true;
        } else {
            z = false;
        }
        if (!this.addressRenderData.isEmpty()) {
            Iterator<T> it = this.addressRenderData.iterator();
            while (true) {
                T t = null;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (next instanceof d) {
                    t = next;
                }
                T t2 = t;
                if (t2 != null && t2.f85924a) {
                    if (next != null) {
                        z2 = false;
                    }
                }
            }
            boolean z4 = parcelable instanceof DeliveryPanelStarter.EnterParamForProductDetailPage;
            a2 = this.selectedShipToInfo.a();
            if (a2 != null || a2.f85924a) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (((z || !z2) && !z3) || !z4) {
                return true;
            }
            return false;
        }
        z2 = true;
        boolean z42 = parcelable instanceof DeliveryPanelStarter.EnterParamForProductDetailPage;
        a2 = this.selectedShipToInfo.a();
        if (a2 != null) {
        }
        z3 = false;
        if (z) {
        }
        return true;
    }

    public DeliveryPanelState(b bVar, boolean z, LogisticDTO logisticDTO, a aVar, List<? extends Object> list, int i2, List<? extends Object> list2, Set<LogisticDTO> set) {
        l.d(bVar, "");
        l.d(aVar, "");
        l.d(list, "");
        l.d(set, "");
        this.changePage = bVar;
        this.apply = z;
        this.selectedLogistic = logisticDTO;
        this.selectedShipToInfo = aVar;
        this.addressRenderData = list;
        this.status = i2;
        this.logisticList = list2;
        this.exposedItems = set;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DeliveryPanelState(b bVar, boolean z, LogisticDTO logisticDTO, a aVar, List list, int i2, List list2, Set set, int i3, g gVar) {
        this((i3 & 1) != 0 ? new b(a.NONE) : bVar, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? null : logisticDTO, (i3 & 8) != 0 ? new a() : aVar, (i3 & 16) != 0 ? z.INSTANCE : list, (i3 & 32) == 0 ? i2 : 0, (i3 & 64) == 0 ? list2 : null, (i3 & 128) != 0 ? new LinkedHashSet() : set);
    }
}
