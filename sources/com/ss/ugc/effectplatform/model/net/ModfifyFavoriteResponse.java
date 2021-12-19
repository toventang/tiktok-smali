package com.ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.h;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class ModfifyFavoriteResponse extends h<List<? extends String>> {
    private List<String> data;
    private String message;
    private int status_code;

    static {
        Covode.recordClassIndex(102506);
    }

    public ModfifyFavoriteResponse() {
        this(null, null, 0, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.ugc.effectplatform.model.net.ModfifyFavoriteResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ModfifyFavoriteResponse copy$default(ModfifyFavoriteResponse modfifyFavoriteResponse, List list, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = modfifyFavoriteResponse.data;
        }
        if ((i3 & 2) != 0) {
            str = modfifyFavoriteResponse.message;
        }
        if ((i3 & 4) != 0) {
            i2 = modfifyFavoriteResponse.status_code;
        }
        return modfifyFavoriteResponse.copy(list, str, i2);
    }

    @Override // com.ss.ugc.effectplatform.model.h
    public final boolean checkValue() {
        return true;
    }

    public final List<String> component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.status_code;
    }

    public final ModfifyFavoriteResponse copy(List<String> list, String str, int i2) {
        return new ModfifyFavoriteResponse(list, str, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModfifyFavoriteResponse)) {
            return false;
        }
        ModfifyFavoriteResponse modfifyFavoriteResponse = (ModfifyFavoriteResponse) obj;
        return l.a(this.data, modfifyFavoriteResponse.data) && l.a(this.message, modfifyFavoriteResponse.message) && this.status_code == modfifyFavoriteResponse.status_code;
    }

    public final int hashCode() {
        List<String> list = this.data;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.message;
        if (str != null) {
            i2 = str.hashCode();
        }
        return ((hashCode + i2) * 31) + this.status_code;
    }

    public final String toString() {
        return "ModfifyFavoriteResponse(data=" + this.data + ", message=" + this.message + ", status_code=" + this.status_code + ")";
    }

    public final List<String> getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    /* Return type fixed from 'java.util.List<java.lang.String>' to match base method */
    @Override // com.ss.ugc.effectplatform.model.h
    public final List<? extends String> getResponseData() {
        return this.data;
    }

    @Override // com.ss.ugc.effectplatform.model.h
    public final String getResponseMessage() {
        return this.message;
    }

    @Override // com.ss.ugc.effectplatform.model.h
    public final int getStatusCode() {
        return this.status_code;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    public final void setData(List<String> list) {
        this.data = list;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i2) {
        this.status_code = i2;
    }

    public ModfifyFavoriteResponse(List<String> list, String str, int i2) {
        this.data = list;
        this.message = str;
        this.status_code = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ModfifyFavoriteResponse(List list, String str, int i2, int i3, g gVar) {
        this((i3 & 1) != 0 ? null : list, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? 0 : i2);
    }
}
