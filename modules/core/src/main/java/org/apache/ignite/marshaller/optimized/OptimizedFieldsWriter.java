/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ignite.marshaller.optimized;

import org.jetbrains.annotations.*;

import java.io.*;
import java.util.*;

/**
 * TODO: IGNITE-950
 */
public interface OptimizedFieldsWriter {
    /**
     * @param fieldName Field name.
     * @param val Value to write.
     * @throws IOException In case of error.
     */
    public void writeByte(String fieldName, byte val) throws IOException;

    /**
     * @param fieldName Field name.
     * @param val Value to write.
     * @throws IOException In case of error.
     */
    public void writeShort(String fieldName, short val) throws IOException;

    /**
     * @param fieldName Field name.
     * @param val Value to write.
     * @throws IOException In case of error.
     */
    public void writeInt(String fieldName, int val) throws IOException;

    /**
     * @param fieldName Field name.
     * @param val Value to write.
     * @throws IOException In case of error.
     */
    public void writeLong(String fieldName, long val) throws IOException;

    /**
     * @param fieldName Field name.
     * @param val Value to write.
     * @throws IOException In case of error.
     */
    public void writeFloat(String fieldName, float val) throws IOException;

    /**
     * @param fieldName Field name.
     * @param val Value to write.
     * @throws IOException In case of error.
     */
    public void writeDouble(String fieldName, double val) throws IOException;

    /**
     * @param fieldName Field name.
     * @param val Value to write.
     * @throws IOException In case of error.
     */
    public void writeChar(String fieldName, char val) throws IOException;

    /**
     * @param fieldName Field name.
     * @param val Value to write.
     * @throws IOException In case of error.
     */
    public void writeBoolean(String fieldName, boolean val) throws IOException;

    /**
     * @param fieldName Field name.
     * @param val Value to write.
     * @throws IOException In case of error.
     */
    public void writeString(String fieldName, @Nullable String val) throws IOException;

    /**
     * @param fieldName Field name.
     * @param obj Value to write.
     * @throws IOException In case of error.
     */
    public void writeObject(String fieldName, @Nullable Object obj) throws IOException;

    /**
     * @param fieldName Field name.
     * @param val Value to write.
     * @throws IOException In case of error.
     */
    public void writeByteArray(String fieldName, @Nullable byte[] val) throws IOException;

    /**
     * @param fieldName Field name.
     * @param val Value to write.
     * @throws IOException In case of error.
     */
    public void writeShortArray(String fieldName, @Nullable short[] val) throws IOException;

    /**
     * @param fieldName Field name.
     * @param val Value to write.
     * @throws IOException In case of error.
     */
    public void writeIntArray(String fieldName, @Nullable int[] val) throws IOException;

    /**
     * @param fieldName Field name.
     * @param val Value to write.
     * @throws IOException In case of error.
     */
    public void writeLongArray(String fieldName, @Nullable long[] val) throws IOException;

    /**
     * @param fieldName Field name.
     * @param val Value to write.
     * @throws IOException In case of error.
     */
    public void writeFloatArray(String fieldName, @Nullable float[] val) throws IOException;

    /**
     * @param fieldName Field name.
     * @param val Value to write.
     * @throws IOException In case of error.
     */
    public void writeDoubleArray(String fieldName, @Nullable double[] val) throws IOException;

    /**
     * @param fieldName Field name.
     * @param val Value to write.
     * @throws IOException In case of error.
     */
    public void writeCharArray(String fieldName, @Nullable char[] val) throws IOException;

    /**
     * @param fieldName Field name.
     * @param val Value to write.
     * @throws IOException In case of error.
     */
    public void writeBooleanArray(String fieldName, @Nullable boolean[] val) throws IOException;

    /**
     * @param fieldName Field name.
     * @param val Value to write.
     * @throws IOException In case of error.
     */
    public void writeStringArray(String fieldName, @Nullable String[] val) throws IOException;

    /**
     * @param fieldName Field name.
     * @param val Value to write.
     * @throws IOException In case of error.
     */
    public void writeObjectArray(String fieldName, @Nullable Object[] val) throws IOException;

    /**
     * @param fieldName Field name.
     * @param col Collection to write.
     * @throws IOException In case of error.
     */
    public <T> void writeCollection(String fieldName, @Nullable Collection<T> col) throws IOException;

    /**
     * @param fieldName Field name.
     * @param map Map to write.
     * @throws IOException In case of error.
     */
    public <K, V> void writeMap(String fieldName, @Nullable Map<K, V> map) throws IOException;

    /**
     * @param fieldName Field name.
     * @param val Value to write.
     * @throws IOException In case of error.
     */
    public <T extends Enum<?>> void writeEnum(String fieldName, T val) throws IOException;

    /**
     * @param fieldName Field name.
     * @param val Value to write.
     * @throws IOException In case of error.
     */
    public <T extends Enum<?>> void writeEnumArray(String fieldName, T[] val) throws IOException;
}