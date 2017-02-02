package br.com.sistema.converter;

import br.com.sistema.model.TipoContato;
import br.com.sistema.repository.TipoContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

/**
 * Created by alessandro on 28/01/17.
 */

@Component
public class TipoContatoConverter implements Converter {

    @Autowired
    TipoContatoRepository tipoContatoRepository;

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {
        TipoContato tipoContato = tipoContatoRepository.findOne(new Integer(value));
        return tipoContato;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object obj) {
        if(obj instanceof TipoContato){
            TipoContato tipoContato = (TipoContato)obj;
            return tipoContato.getId().toString();
        } else {
            return null;
        }
    }
}
