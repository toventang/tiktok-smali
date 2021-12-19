package com.bytedance.frameworks.baselib.network.http.e;

import com.bytedance.covode.number.Covode;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Locale;

public class a implements Externalizable {
    private b parameters;
    private String primaryType;
    private String subType;

    static {
        Covode.recordClassIndex(17111);
    }

    public b getParameters() {
        return this.parameters;
    }

    public String getPrimaryType() {
        return this.primaryType;
    }

    public String getSubType() {
        return this.subType;
    }

    public a() {
        this.primaryType = "application";
        this.subType = "*";
        this.parameters = new b();
    }

    public String getBaseType() {
        return this.primaryType + "/" + this.subType;
    }

    public String toString() {
        return getBaseType() + this.parameters.toString();
    }

    public a(String str) {
        a(str);
    }

    public boolean match(String str) {
        return match(new a(str));
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeUTF(toString());
        objectOutput.flush();
    }

    private static boolean a(char c2) {
        if (c2 <= ' ' || c2 >= 127 || "()<>@,;:/[]?=\\\"".indexOf(c2) >= 0) {
            return false;
        }
        return true;
    }

    private static boolean b(String str) {
        int length = str.length();
        if (length <= 0) {
            return false;
        }
        int i2 = 0;
        while (a(str.charAt(i2))) {
            i2++;
            if (i2 >= length) {
                return true;
            }
        }
        return false;
    }

    public String getParameter(String str) {
        return (String) this.parameters.f29342a.get(str.trim().toLowerCase(Locale.ENGLISH));
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        try {
            a(objectInput.readUTF());
        } catch (c e2) {
            throw new IOException(e2.toString());
        }
    }

    public void removeParameter(String str) {
        this.parameters.f29342a.remove(str.trim().toLowerCase(Locale.ENGLISH));
    }

    public void setPrimaryType(String str) {
        if (b(this.primaryType)) {
            this.primaryType = str.toLowerCase(Locale.ENGLISH);
            return;
        }
        throw new c("Primary type is invalid.");
    }

    public void setSubType(String str) {
        if (b(this.subType)) {
            this.subType = str.toLowerCase(Locale.ENGLISH);
            return;
        }
        throw new c("Sub type is invalid.");
    }

    public boolean match(a aVar) {
        if (!this.primaryType.equals(aVar.getPrimaryType())) {
            return false;
        }
        if (this.subType.equals("*") || aVar.getSubType().equals("*") || this.subType.equals(aVar.getSubType())) {
            return true;
        }
        return false;
    }

    private void a(String str) {
        int indexOf = str.indexOf(47);
        int indexOf2 = str.indexOf(59);
        if (indexOf >= 0) {
            if (indexOf >= 0 && indexOf2 < 0) {
                this.primaryType = str.substring(0, indexOf).trim().toLowerCase(Locale.ENGLISH);
                this.subType = str.substring(indexOf + 1).trim().toLowerCase(Locale.ENGLISH);
                this.parameters = new b();
            } else if (indexOf < indexOf2) {
                this.primaryType = str.substring(0, indexOf).trim().toLowerCase(Locale.ENGLISH);
                this.subType = str.substring(indexOf + 1, indexOf2).trim().toLowerCase(Locale.ENGLISH);
                this.parameters = new b(str.substring(indexOf2));
            } else {
                throw new c("Unable to find a sub type.");
            }
            if (!b(this.primaryType)) {
                throw new c("Primary type is invalid.");
            } else if (!b(this.subType)) {
                throw new c("Sub type is invalid.");
            }
        } else if (indexOf2 >= 0) {
            throw new c("Unable to find a sub type.");
        } else {
            throw new c("Unable to find a sub type.");
        }
    }

    public void setParameter(String str, String str2) {
        this.parameters.f29342a.put(str.trim().toLowerCase(Locale.ENGLISH), str2);
    }

    public a(String str, String str2) {
        if (b(str)) {
            this.primaryType = str.toLowerCase(Locale.ENGLISH);
            if (b(str2)) {
                this.subType = str2.toLowerCase(Locale.ENGLISH);
                this.parameters = new b();
                return;
            }
            throw new c("Sub type is invalid.");
        }
        throw new c("Primary type is invalid.");
    }
}
