package guru.springframework.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"recipe"})
@ToString

@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
    public void setRecipeNotes(String recipeNotes) {
        this.recipeNotes = recipeNotes;
    }




}
