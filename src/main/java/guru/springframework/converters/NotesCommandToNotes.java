package guru.springframework.converters;

import guru.springframework.commands.NotesCommand;
import guru.springframework.domain.Notes;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class NotesCommandToNotes  implements Converter<NotesCommand, Notes> {

    @Synchronized
    @Nullable
    @Override
    public Notes convert(NotesCommand source) {
        if (source == null) {
            return null;
        }

        final Notes ingredient = new Notes();
        ingredient.setId(source.getId());
        ingredient.setRecipe(source.getRecipe());
        ingredient.setRecipeNotes(source.getRecipeNotes());
        return ingredient;
    }

}
