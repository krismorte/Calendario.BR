/*
 * Copyright 2018 Dell.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.krismorte.feriados.br;

import com.krismorte.feriados.br.model.Events;
import com.krismorte.feriados.br.web.ApiFeriados;

/**
 *
 * @author Dell
 */
public class FeriadoBR {

    private ApiFeriados apiFeriados = new ApiFeriados();
    private String token;

    public FeriadoBR(String token) {
        this.token = token;
    }

    public Events get(int ano, String estado, String cidade) throws Exception {
        return apiFeriados.listAll(ano, estado, cidade, token);
    }

}
