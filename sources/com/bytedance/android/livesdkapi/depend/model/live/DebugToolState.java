package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class DebugToolState implements Serializable {
    @c(a = "can_debug_tool")
    private Boolean canDebugTool;

    static {
        Covode.recordClassIndex(13650);
    }

    public DebugToolState() {
        this(null, 1, null);
    }

    public static /* synthetic */ DebugToolState copy$default(DebugToolState debugToolState, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bool = debugToolState.canDebugTool;
        }
        return debugToolState.copy(bool);
    }

    public final Boolean component1() {
        return this.canDebugTool;
    }

    public final DebugToolState copy(Boolean bool) {
        return new DebugToolState(bool);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof DebugToolState) && l.a(this.canDebugTool, ((DebugToolState) obj).canDebugTool);
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.canDebugTool;
        if (bool != null) {
            return bool.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "DebugToolState(canDebugTool=" + this.canDebugTool + ")";
    }

    public final Boolean getCanDebugTool() {
        return this.canDebugTool;
    }

    public final void setCanDebugTool(Boolean bool) {
        this.canDebugTool = bool;
    }

    public DebugToolState(Boolean bool) {
        this.canDebugTool = bool;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DebugToolState(Boolean bool, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : bool);
    }
}
