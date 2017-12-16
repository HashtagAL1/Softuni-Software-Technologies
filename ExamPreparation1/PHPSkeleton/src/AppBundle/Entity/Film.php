<?php

namespace AppBundle\Entity;

use Doctrine\ORM\Mapping as ORM;

/**
 * Film
 *
 * @ORM\Table(name="films")
 * @ORM\Entity(repositoryClass="AppBundle\Repository\FilmRepository")
 */
class Film
{
    /**
     * @var int
     * @ORM\Column(name="id", type="integer")
     * @ORM\Id
     * @ORM\GeneratedValue(strategy="AUTO")
     */
    private $id;

    /**
     * @var int
     * @ORM\Column(name="year", type="integer")
     */
    private $year;

    /**
     * @var string
     * @ORM\Column(name="director", type="string")
     */
    private $director;

    /**
     * @var string
     * @ORM\Column(name="name", type="string")
     */
    private $name;

    /**
     * @var string
     * @ORM\Column(name="genre", type="string")
     */
    private $genre;

    /**
     * @param int $year
     * @return Film;
     */
    public function setYear($year)
    {
        $this->year = $year;
        return $this;
    }

    /**
     * @param string $director
     * @return Film
     */
    public function setDirector($director)
    {
        $this->director = $director;
        return $this;
    }

    /**
     * @param string $name
     * @return Film
     */
    public function setName($name)
    {
        $this->name = $name;
        return $this;
    }

    /**
     * @param string $genre
     * @return Film
     */
    public function setGenre($genre)
    {
        $this->genre = $genre;
        return $this;
    }

    /**
     * @return int
     */
    public function getId()
    {
        return $this->id;
    }

    /**
     * @return int
     */
    public function getYear()
    {
        return $this->year;
    }

    /**
     * @return string
     */
    public function getDirector()
    {
        return $this->director;
    }

    /**
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * @return string
     */
    public function getGenre()
    {
        return $this->genre;
    }



}

