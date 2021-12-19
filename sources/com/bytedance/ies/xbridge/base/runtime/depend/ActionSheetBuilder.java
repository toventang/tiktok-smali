package com.bytedance.ies.xbridge.base.runtime.depend;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class ActionSheetBuilder {
    private final List<ActionSheetBuilderAction> actions;
    private final Context context;
    private final String subtitle;
    private final String title;

    static {
        Covode.recordClassIndex(21408);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.ies.xbridge.base.runtime.depend.ActionSheetBuilder */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActionSheetBuilder copy$default(ActionSheetBuilder actionSheetBuilder, Context context2, String str, String str2, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            context2 = actionSheetBuilder.context;
        }
        if ((i2 & 2) != 0) {
            str = actionSheetBuilder.title;
        }
        if ((i2 & 4) != 0) {
            str2 = actionSheetBuilder.subtitle;
        }
        if ((i2 & 8) != 0) {
            list = actionSheetBuilder.actions;
        }
        return actionSheetBuilder.copy(context2, str, str2, list);
    }

    public final Context component1() {
        return this.context;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.subtitle;
    }

    public final List<ActionSheetBuilderAction> component4() {
        return this.actions;
    }

    public final ActionSheetBuilder copy(Context context2, String str, String str2, List<ActionSheetBuilderAction> list) {
        l.c(context2, "");
        l.c(list, "");
        return new ActionSheetBuilder(context2, str, str2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionSheetBuilder)) {
            return false;
        }
        ActionSheetBuilder actionSheetBuilder = (ActionSheetBuilder) obj;
        return l.a(this.context, actionSheetBuilder.context) && l.a(this.title, actionSheetBuilder.title) && l.a(this.subtitle, actionSheetBuilder.subtitle) && l.a(this.actions, actionSheetBuilder.actions);
    }

    public final int hashCode() {
        Context context2 = this.context;
        int i2 = 0;
        int hashCode = (context2 != null ? context2.hashCode() : 0) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.subtitle;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<ActionSheetBuilderAction> list = this.actions;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "ActionSheetBuilder(context=" + this.context + ", title=" + this.title + ", subtitle=" + this.subtitle + ", actions=" + this.actions + ")";
    }

    public final List<ActionSheetBuilderAction> getActions() {
        return this.actions;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public ActionSheetBuilder(Context context2, String str, String str2, List<ActionSheetBuilderAction> list) {
        l.c(context2, "");
        l.c(list, "");
        this.context = context2;
        this.title = str;
        this.subtitle = str2;
        this.actions = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ActionSheetBuilder(Context context2, String str, String str2, List list, int i2, g gVar) {
        this(context2, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, list);
    }
}
